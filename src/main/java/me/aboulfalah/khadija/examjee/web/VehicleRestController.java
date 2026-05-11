package me.aboulfalah.khadija.examjee.web;

import lombok.RequiredArgsConstructor;
import me.aboulfalah.khadija.examjee.dtos.CarDTO;
import me.aboulfalah.khadija.examjee.dtos.MotorcycleDTO;
import me.aboulfalah.khadija.examjee.dtos.VehicleDTO;
import me.aboulfalah.khadija.examjee.services.RentalService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
@RequiredArgsConstructor
@CrossOrigin("*")
public class VehicleRestController {
    private final RentalService rentalService;

    @GetMapping
    public List<VehicleDTO> listVehicles() {
        return rentalService.listVehicles();
    }

    @PostMapping("/cars")
    public VehicleDTO saveCar(@RequestBody CarDTO carDTO, @RequestParam Long agencyId) {
        return rentalService.saveVehicle(carDTO, agencyId);
    }

    @PostMapping("/motorcycles")
    public VehicleDTO saveMotorcycle(@RequestBody MotorcycleDTO motorcycleDTO, @RequestParam Long agencyId) {
        return rentalService.saveVehicle(motorcycleDTO, agencyId);
    }

    @GetMapping("/agency/{agencyId}")
    public List<VehicleDTO> getVehiclesByAgency(@PathVariable Long agencyId) {
        return rentalService.getVehiclesByAgency(agencyId);
    }
}
