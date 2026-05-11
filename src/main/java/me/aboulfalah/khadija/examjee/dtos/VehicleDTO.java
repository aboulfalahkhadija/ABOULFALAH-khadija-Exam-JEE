package me.aboulfalah.khadija.examjee.dtos;

import lombok.Data;
import me.aboulfalah.khadija.examjee.enums.VehicleStatus;
import java.util.Date;

@Data
public abstract class VehicleDTO {
    private Long id;
    private String marque;
    private String modele;
    private String matricule;
    private Double prixParJour;
    private Date dateMiseEnService;
    private VehicleStatus statut;
    private String type;
}
