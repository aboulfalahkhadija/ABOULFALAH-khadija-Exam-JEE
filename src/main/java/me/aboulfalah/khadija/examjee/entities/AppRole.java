package me.aboulfalah.khadija.examjee.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class AppRole {
    @Id
    private String roleName;
}
