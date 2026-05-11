package me.aboulfalah.khadija.examjee.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.aboulfalah.khadija.examjee.enums.FuelType;
import me.aboulfalah.khadija.examjee.enums.Gearbox;

@Data @EqualsAndHashCode(callSuper = true)
public class CarDTO extends VehicleDTO {
    private Integer nombrePortes;
    private FuelType typeCarburant;
    private Gearbox boiteVitesse;

    public CarDTO() {
        this.setType("Car");
    }
}
