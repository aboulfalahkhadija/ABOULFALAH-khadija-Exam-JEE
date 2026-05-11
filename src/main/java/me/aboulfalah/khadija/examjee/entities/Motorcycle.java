package me.aboulfalah.khadija.examjee.entities;

import jakarta.persistence.*;
import lombok.*;
import me.aboulfalah.khadija.examjee.enums.MotoType;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode(callSuper = true)
public class Motorcycle extends Vehicle {
    private Double cylindree;

    @Enumerated(EnumType.STRING)
    private MotoType typeMoto;

    private boolean casqueInclus;
}
