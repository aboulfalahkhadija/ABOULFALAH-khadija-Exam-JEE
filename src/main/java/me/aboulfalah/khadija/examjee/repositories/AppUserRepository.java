package me.aboulfalah.khadija.examjee.repositories;

import me.aboulfalah.khadija.examjee.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
