package me.aboulfalah.khadija.examjee.web;

import lombok.RequiredArgsConstructor;
import me.aboulfalah.khadija.examjee.security.AccountService;
import me.aboulfalah.khadija.examjee.security.JwtUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AuthRestController {
    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;
    private final AccountService accountService;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> loginData) {
        String username = loginData.get("username");
        String password = loginData.get("password");

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password));

        String jwt = jwtUtils.generateToken(username,
                authentication.getAuthorities().stream()
                        .map(GrantedAuthority::getAuthority)
                        .collect(Collectors.toList()));

        Map<String, String> response = new HashMap<>();
        response.put("token", jwt);
        return response;
    }

    @PostMapping("/register")
    public void register(@RequestBody Map<String, String> userData) {
        accountService.addNewUser(
                userData.get("username"),
                userData.get("password"),
                userData.get("email"),
                userData.get("password")
        );
        accountService.addRoleToUser(userData.get("username"), "ROLE_CLIENT");
    }
}
