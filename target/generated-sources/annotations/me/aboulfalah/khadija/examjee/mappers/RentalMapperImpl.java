package me.aboulfalah.khadija.examjee.mappers;

import javax.annotation.processing.Generated;
import me.aboulfalah.khadija.examjee.dtos.RentalDTO;
import me.aboulfalah.khadija.examjee.entities.Rental;
import me.aboulfalah.khadija.examjee.entities.Vehicle;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-11T16:18:18+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.6 (Eclipse Adoptium)"
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
        rentalDTO.setId( rental.getId() );
        rentalDTO.setDateDebut( rental.getDateDebut() );
        rentalDTO.setDateFin( rental.getDateFin() );
        rentalDTO.setPrixTotal( rental.getPrixTotal() );

        return rentalDTO;
    }

    @Override
    public Rental fromRentalDTO(RentalDTO rentalDTO) {
        if ( rentalDTO == null ) {
            return null;
        }

        Rental.RentalBuilder rental = Rental.builder();

        rental.id( rentalDTO.getId() );
        rental.dateDebut( rentalDTO.getDateDebut() );
        rental.dateFin( rentalDTO.getDateFin() );
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
