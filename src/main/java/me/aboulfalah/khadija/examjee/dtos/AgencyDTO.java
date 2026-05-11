package me.aboulfalah.khadija.examjee.dtos;

import lombok.Data;

@Data
public class AgencyDTO {
    private Long id;
    private String nom;
    private String adresse;
    private String ville;
    private String telephone;
}
