package me.aboulfalah.khadija.examjee.mappers;

import me.aboulfalah.khadija.examjee.dtos.CarDTO;
import me.aboulfalah.khadija.examjee.dtos.MotorcycleDTO;
import me.aboulfalah.khadija.examjee.dtos.VehicleDTO;
import me.aboulfalah.khadija.examjee.entities.Car;
import me.aboulfalah.khadija.examjee.entities.Motorcycle;
import me.aboulfalah.khadija.examjee.entities.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VehicleMapper {
    default VehicleDTO fromVehicle(Vehicle vehicle) {
        if (vehicle instanceof Car) return fromCar((Car) vehicle);
        if (vehicle instanceof Motorcycle) return fromMotorcycle((Motorcycle) vehicle);
        return null;
    }

    @Mapping(target = "type", constant = "Car")
    CarDTO fromCar(Car car);
    Car fromCarDTO(CarDTO carDTO);

    @Mapping(target = "type", constant = "Motorcycle")
    MotorcycleDTO fromMotorcycle(Motorcycle motorcycle);
    Motorcycle fromMotorcycleDTO(MotorcycleDTO motorcycleDTO);
}
