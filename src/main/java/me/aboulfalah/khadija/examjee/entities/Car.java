package me.aboulfalah.khadija.examjee.entities;

import jakarta.persistence.*;
import lombok.*;
import me.aboulfalah.khadija.examjee.enums.FuelType;
import me.aboulfalah.khadija.examjee.enums.Gearbox;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode(callSuper = true)
public class Car extends Vehicle {
    private Integer nombrePortes;

    @Enumerated(EnumType.STRING)
    private FuelType typeCarburant;

    @Enumerated(EnumType.STRING)
    private Gearbox boiteVitesse;
}
