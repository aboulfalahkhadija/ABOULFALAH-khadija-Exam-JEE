package me.aboulfalah.khadija.examjee.mappers;

import javax.annotation.processing.Generated;
import me.aboulfalah.khadija.examjee.dtos.CarDTO;
import me.aboulfalah.khadija.examjee.dtos.MotorcycleDTO;
import me.aboulfalah.khadija.examjee.entities.Car;
import me.aboulfalah.khadija.examjee.entities.Motorcycle;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-11T16:18:18+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class VehicleMapperImpl implements VehicleMapper {

    @Override
    public CarDTO fromCar(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        carDTO.setId( car.getId() );
        carDTO.setMarque( car.getMarque() );
        carDTO.setModele( car.getModele() );
        carDTO.setMatricule( car.getMatricule() );
        carDTO.setPrixParJour( car.getPrixParJour() );
        carDTO.setDateMiseEnService( car.getDateMiseEnService() );
        carDTO.setStatut( car.getStatut() );
        carDTO.setNombrePortes( car.getNombrePortes() );
        carDTO.setTypeCarburant( car.getTypeCarburant() );
        carDTO.setBoiteVitesse( car.getBoiteVitesse() );

        carDTO.setType( "Car" );

        return carDTO;
    }

    @Override
    public Car fromCarDTO(CarDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Car car = new Car();

        car.setId( carDTO.getId() );
        car.setMarque( carDTO.getMarque() );
        car.setModele( carDTO.getModele() );
        car.setMatricule( carDTO.getMatricule() );
        car.setPrixParJour( carDTO.getPrixParJour() );
        car.setDateMiseEnService( carDTO.getDateMiseEnService() );
        car.setStatut( carDTO.getStatut() );
        car.setNombrePortes( carDTO.getNombrePortes() );
        car.setTypeCarburant( carDTO.getTypeCarburant() );
        car.setBoiteVitesse( carDTO.getBoiteVitesse() );

        return car;
    }

    @Override
    public MotorcycleDTO fromMotorcycle(Motorcycle motorcycle) {
        if ( motorcycle == null ) {
            return null;
        }

        MotorcycleDTO motorcycleDTO = new MotorcycleDTO();

        motorcycleDTO.setId( motorcycle.getId() );
        motorcycleDTO.setMarque( motorcycle.getMarque() );
        motorcycleDTO.setModele( motorcycle.getModele() );
        motorcycleDTO.setMatricule( motorcycle.getMatricule() );
        motorcycleDTO.setPrixParJour( motorcycle.getPrixParJour() );
        motorcycleDTO.setDateMiseEnService( motorcycle.getDateMiseEnService() );
        motorcycleDTO.setStatut( motorcycle.getStatut() );
        motorcycleDTO.setCylindree( motorcycle.getCylindree() );
        motorcycleDTO.setTypeMoto( motorcycle.getTypeMoto() );
        motorcycleDTO.setCasqueInclus( motorcycle.isCasqueInclus() );

        motorcycleDTO.setType( "Motorcycle" );

        return motorcycleDTO;
    }

    @Override
    public Motorcycle fromMotorcycleDTO(MotorcycleDTO motorcycleDTO) {
        if ( motorcycleDTO == null ) {
            return null;
        }

        Motorcycle motorcycle = new Motorcycle();

        motorcycle.setId( motorcycleDTO.getId() );
        motorcycle.setMarque( motorcycleDTO.getMarque() );
        motorcycle.setModele( motorcycleDTO.getModele() );
        motorcycle.setMatricule( motorcycleDTO.getMatricule() );
        motorcycle.setPrixParJour( motorcycleDTO.getPrixParJour() );
        motorcycle.setDateMiseEnService( motorcycleDTO.getDateMiseEnService() );
        motorcycle.setStatut( motorcycleDTO.getStatut() );
        motorcycle.setCylindree( motorcycleDTO.getCylindree() );
        motorcycle.setTypeMoto( motorcycleDTO.getTypeMoto() );
        motorcycle.setCasqueInclus( motorcycleDTO.isCasqueInclus() );

        return motorcycle;
    }
}
