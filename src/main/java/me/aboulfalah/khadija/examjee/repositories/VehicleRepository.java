package me.aboulfalah.khadija.examjee.repositories;

import me.aboulfalah.khadija.examjee.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
