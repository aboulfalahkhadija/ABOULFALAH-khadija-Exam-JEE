package me.aboulfalah.khadija.examjee.web;

import lombok.RequiredArgsConstructor;
import me.aboulfalah.khadija.examjee.dtos.AgencyDTO;
import me.aboulfalah.khadija.examjee.services.RentalService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/agencies")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AgencyRestController {
    private final RentalService rentalService;

    @GetMapping
    public List<AgencyDTO> listAgencies() {
        return rentalService.listAgencies();
    }

    @PostMapping
    public AgencyDTO saveAgency(@RequestBody AgencyDTO agencyDTO) {
        return rentalService.saveAgency(agencyDTO);
    }

    @GetMapping("/{id}")
    public AgencyDTO getAgency(@PathVariable Long id) {
        return rentalService.getAgency(id);
    }
}
