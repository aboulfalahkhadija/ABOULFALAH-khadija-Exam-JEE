package me.aboulfalah.khadija.examjee.services;

import me.aboulfalah.khadija.examjee.dtos.*;
import java.util.List;

public interface RentalService {
    AgencyDTO saveAgency(AgencyDTO agencyDTO);
    List<AgencyDTO> listAgencies();
    AgencyDTO getAgency(Long id);

    VehicleDTO saveVehicle(VehicleDTO vehicleDTO, Long agencyId);
    List<VehicleDTO> listVehicles();
    List<VehicleDTO> getVehiclesByAgency(Long agencyId);

    RentalDTO saveRental(RentalDTO rentalDTO);
    List<RentalDTO> listRentals();
    List<RentalDTO> getRentalHistoryByVehicle(Long vehicleId);
}
