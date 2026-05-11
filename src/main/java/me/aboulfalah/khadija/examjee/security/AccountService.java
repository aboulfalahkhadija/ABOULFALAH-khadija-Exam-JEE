package me.aboulfalah.khadija.examjee.security;

import me.aboulfalah.khadija.examjee.entities.AppRole;
import me.aboulfalah.khadija.examjee.entities.AppUser;
import java.util.List;

public interface AccountService {
    AppUser addNewUser(String username, String password, String email, String confirmPassword);
    AppRole addNewRole(String roleName);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}
