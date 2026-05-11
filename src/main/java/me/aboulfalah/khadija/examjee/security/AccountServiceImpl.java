package me.aboulfalah.khadija.examjee.security;

import lombok.RequiredArgsConstructor;
import me.aboulfalah.khadija.examjee.entities.AppRole;
import me.aboulfalah.khadija.examjee.entities.AppUser;
import me.aboulfalah.khadija.examjee.repositories.AppRoleRepository;
import me.aboulfalah.khadija.examjee.repositories.AppUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AppUserRepository userRepository;
    private final AppRoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public AppUser addNewUser(String username, String password, String email, String confirmPassword) {
        if(!password.equals(confirmPassword)) throw new RuntimeException("Passwords do not match");
        AppUser user = AppUser.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .email(email)
                .build();
        return userRepository.save(user);
    }

    @Override
    public AppRole addNewRole(String roleName) {
        return roleRepository.save(new AppRole(roleName));
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        AppUser user = userRepository.findByUsername(username);
        AppRole role = roleRepository.findById(roleName).get();
        user.getRoles().add(role);
    }

    @Override
    public AppUser loadUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<AppUser> listUsers() {
        return userRepository.findAll();
    }
}
