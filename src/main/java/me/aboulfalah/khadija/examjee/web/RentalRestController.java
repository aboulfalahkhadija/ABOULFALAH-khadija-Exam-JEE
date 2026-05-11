package me.aboulfalah.khadija.examjee.web;

import lombok.RequiredArgsConstructor;
import me.aboulfalah.khadija.examjee.dtos.RentalDTO;
import me.aboulfalah.khadija.examjee.services.RentalService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/rentals")
@RequiredArgsConstructor
@CrossOrigin("*")
public class RentalRestController {
    private final RentalService rentalService;

    @GetMapping
    public List<RentalDTO> listRentals() {
        return rentalService.listRentals();
    }

    @PostMapping
    public RentalDTO saveRental(@RequestBody RentalDTO rentalDTO) {
        return rentalService.saveRental(rentalDTO);
    }

    @GetMapping("/vehicle/{vehicleId}")
    public List<RentalDTO> getHistory(@PathVariable Long vehicleId) {
        return rentalService.getRentalHistoryByVehicle(vehicleId);
    }
}
