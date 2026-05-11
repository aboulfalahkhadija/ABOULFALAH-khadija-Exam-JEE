package me.aboulfalah.khadija.examjee.mappers;

import javax.annotation.processing.Generated;
import me.aboulfalah.khadija.examjee.dtos.RentalDTO;
import me.aboulfalah.khadija.examjee.entities.Rental;
import me.aboulfalah.khadija.examjee.entities.Vehicle;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-11T16:51:06+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class RentalMapperImpl implements RentalMapper {

    @Override
    public RentalDTO fromRental(Rental rental) {
        if ( rental == null ) {
            return null;
        }

        RentalDTO rentalDTO = new RentalDTO();

        rentalDTO.setVehicleId( rentalVehicleId( rental ) );
        rentalDTO.setVehicleMarque( rentalVehicleMarque( rental ) );
        rentalDTO.setVehicleModele( rentalVehicleModele( rental ) );
        rentalDTO.setDateDebut( rental.getDateDebut() );
        rentalDTO.setDateFin( rental.getDateFin() );
        rentalDTO.setId( rental.getId() );
        rentalDTO.setPrixTotal( rental.getPrixTotal() );

        return rentalDTO;
    }

    @Override
    public Rental fromRentalDTO(RentalDTO rentalDTO) {
        if ( rentalDTO == null ) {
            return null;
        }

        Rental.RentalBuilder rental = Rental.builder();

        rental.dateDebut( rentalDTO.getDateDebut() );
        rental.dateFin( rentalDTO.getDateFin() );
        rental.id( rentalDTO.getId() );
        rental.prixTotal( rentalDTO.getPrixTotal() );

        return rental.build();
    }

    private Long rentalVehicleId(Rental rental) {
        if ( rental == null ) {
            return null;
        }
        Vehicle vehicle = rental.getVehicle();
        if ( vehicle == null ) {
            return null;
        }
        Long id = vehicle.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String rentalVehicleMarque(Rental rental) {
        if ( rental == null ) {
            return null;
        }
        Vehicle vehicle = rental.getVehicle();
        if ( vehicle == null ) {
            return null;
        }
        String marque = vehicle.getMarque();
        if ( marque == null ) {
            return null;
        }
        return marque;
    }

    private String rentalVehicleModele(Rental rental) {
        if ( rental == null ) {
            return null;
        }
        Vehicle vehicle = rental.getVehicle();
        if ( vehicle == null ) {
            return null;
        }
        String modele = vehicle.getModele();
        if ( modele == null ) {
            return null;
        }
        return modele;
    }
}
