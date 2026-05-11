package me.aboulfalah.khadija.examjee.repositories;

import me.aboulfalah.khadija.examjee.entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}
