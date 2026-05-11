package me.aboulfalah.khadija.examjee.security;

import lombok.RequiredArgsConstructor;
import me.aboulfalah.khadija.examjee.entities.AppUser;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = accountService.loadUserByUsername(username);
        if (appUser == null) throw new UsernameNotFoundException("User not found");

        return new User(appUser.getUsername(), appUser.getPassword(),
                appUser.getRoles().stream()
                        .map(r -> new SimpleGrantedAuthority(r.getRoleName()))
                        .collect(Collectors.toList()));
    }
}
