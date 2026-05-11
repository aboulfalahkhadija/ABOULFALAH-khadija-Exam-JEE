package me.aboulfalah.khadija.examjee.mappers;

import me.aboulfalah.khadija.examjee.dtos.RentalDTO;
import me.aboulfalah.khadija.examjee.entities.Rental;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RentalMapper {
    @Mapping(source = "vehicle.id", target = "vehicleId")
    @Mapping(source = "vehicle.marque", target = "vehicleMarque")
    @Mapping(source = "vehicle.modele", target = "vehicleModele")
    RentalDTO fromRental(Rental rental);

    Rental fromRentalDTO(RentalDTO rentalDTO);
}
