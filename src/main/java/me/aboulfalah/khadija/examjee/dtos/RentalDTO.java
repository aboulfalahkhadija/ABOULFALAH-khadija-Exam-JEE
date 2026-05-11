package me.aboulfalah.khadija.examjee.dtos;

import lombok.Data;
import java.util.Date;

@Data
public class RentalDTO {
    private Long id;
    private Date dateDebut;
    private Date dateFin;
    private Double prixTotal;
    private Long vehicleId;
    private String vehicleMarque;
    private String vehicleModele;
}
