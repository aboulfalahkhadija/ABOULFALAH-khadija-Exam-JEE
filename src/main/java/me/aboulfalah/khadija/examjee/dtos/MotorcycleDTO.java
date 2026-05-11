package me.aboulfalah.khadija.examjee.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.aboulfalah.khadija.examjee.enums.MotoType;

@Data @EqualsAndHashCode(callSuper = true)
public class MotorcycleDTO extends VehicleDTO {
    private Double cylindree;
    private MotoType typeMoto;
    private boolean casqueInclus;

    public MotorcycleDTO() {
        this.setType("Motorcycle");
    }
}
