package me.aboulfalah.khadija.examjee.entities;

import jakarta.persistence.*;
import lombok.*;
import me.aboulfalah.khadija.examjee.enums.VehicleStatus;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data @NoArgsConstructor @AllArgsConstructor
public abstract class Vehicle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marque;
    private String modele;
    private String matricule;
    private Double prixParJour;
    private Date dateMiseEnService;

    @Enumerated(EnumType.STRING)
    private VehicleStatus statut;

    @ManyToOne
    private Agency agency;

    @OneToMany(mappedBy = "vehicle")
    private List<Rental> rentals;
}
