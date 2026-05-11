package me.aboulfalah.khadija.examjee.mappers;

import javax.annotation.processing.Generated;
import me.aboulfalah.khadija.examjee.dtos.CarDTO;
import me.aboulfalah.khadija.examjee.dtos.MotorcycleDTO;
import me.aboulfalah.khadija.examjee.entities.Car;
import me.aboulfalah.khadija.examjee.entities.Motorcycle;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-11T16:51:05+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class VehicleMapperImpl implements VehicleMapper {

    @Override
    public CarDTO fromCar(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        carDTO.setDateMiseEnService( car.getDateMiseEnService() );
        carDTO.setId( car.getId() );
        carDTO.setMarque( car.getMarque() );
        carDTO.setMatricule( car.getMatricule() );
        carDTO.setModele( car.getModele() );
        carDTO.setPrixParJour( car.getPrixParJour() );
        carDTO.setStatut( car.getStatut() );
        carDTO.setBoiteVitesse( car.getBoiteVitesse() );
        carDTO.setNombrePortes( car.getNombrePortes() );
        carDTO.setTypeCarburant( car.getTypeCarburant() );

        carDTO.setType( "Car" );

        return carDTO;
    }

    @Override
    public Car fromCarDTO(CarDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Car car = new Car();

        car.setDateMiseEnService( carDTO.getDateMiseEnService() );
        car.setId( carDTO.getId() );
        car.setMarque( carDTO.getMarque() );
        car.setMatricule( carDTO.getMatricule() );
        car.setModele( carDTO.getModele() );
        car.setPrixParJour( carDTO.getPrixParJour() );
        car.setStatut( carDTO.getStatut() );
        car.setBoiteVitesse( carDTO.getBoiteVitesse() );
        car.setNombrePortes( carDTO.getNombrePortes() );
        car.setTypeCarburant( carDTO.getTypeCarburant() );

        return car;
    }

    @Override
    public MotorcycleDTO fromMotorcycle(Motorcycle motorcycle) {
        if ( motorcycle == null ) {
            return null;
        }

        MotorcycleDTO motorcycleDTO = new MotorcycleDTO();

        motorcycleDTO.setDateMiseEnService( motorcycle.getDateMiseEnService() );
        motorcycleDTO.setId( motorcycle.getId() );
        motorcycleDTO.setMarque( motorcycle.getMarque() );
        motorcycleDTO.setMatricule( motorcycle.getMatricule() );
        motorcycleDTO.setModele( motorcycle.getModele() );
        motorcycleDTO.setPrixParJour( motorcycle.getPrixParJour() );
        motorcycleDTO.setStatut( motorcycle.getStatut() );
        motorcycleDTO.setCasqueInclus( motorcycle.isCasqueInclus() );
        motorcycleDTO.setCylindree( motorcycle.getCylindree() );
        motorcycleDTO.setTypeMoto( motorcycle.getTypeMoto() );

        motorcycleDTO.setType( "Motorcycle" );

        return motorcycleDTO;
    }

    @Override
    public Motorcycle fromMotorcycleDTO(MotorcycleDTO motorcycleDTO) {
        if ( motorcycleDTO == null ) {
            return null;
        }

        Motorcycle motorcycle = new Motorcycle();

        motorcycle.setDateMiseEnService( motorcycleDTO.getDateMiseEnService() );
        motorcycle.setId( motorcycleDTO.getId() );
        motorcycle.setMarque( motorcycleDTO.getMarque() );
        motorcycle.setMatricule( motorcycleDTO.getMatricule() );
        motorcycle.setModele( motorcycleDTO.getModele() );
        motorcycle.setPrixParJour( motorcycleDTO.getPrixParJour() );
        motorcycle.setStatut( motorcycleDTO.getStatut() );
        motorcycle.setCasqueInclus( motorcycleDTO.isCasqueInclus() );
        motorcycle.setCylindree( motorcycleDTO.getCylindree() );
        motorcycle.setTypeMoto( motorcycleDTO.getTypeMoto() );

        return motorcycle;
    }
}
