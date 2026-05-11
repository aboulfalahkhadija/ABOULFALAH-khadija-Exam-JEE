package me.aboulfalah.khadija.examjee.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class AppUser {
    @Id
    private String username;
    private String password;
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<AppRole> roles = new ArrayList<>();
}
