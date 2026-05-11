package me.aboulfalah.khadija.examjee.services;

import lombok.RequiredArgsConstructor;
import me.aboulfalah.khadija.examjee.dtos.*;
import me.aboulfalah.khadija.examjee.entities.*;
import me.aboulfalah.khadija.examjee.mappers.AgencyMapper;
import me.aboulfalah.khadija.examjee.mappers.RentalMapper;
import me.aboulfalah.khadija.examjee.mappers.VehicleMapper;
import me.aboulfalah.khadija.examjee.repositories.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    private final AgencyRepository agencyRepository;
    private final VehicleRepository vehicleRepository;
    private final RentalRepository rentalRepository;
    private final RentalMapper rentalMapper;
    private final AgencyMapper agencyMapper;
    private final VehicleMapper vehicleMapper;

    @Override
    public AgencyDTO saveAgency(AgencyDTO agencyDTO) {
        Agency agency = agencyMapper.fromAgencyDTO(agencyDTO);
        return agencyMapper.fromAgency(agencyRepository.save(agency));
    }

    @Override
    public List<AgencyDTO> listAgencies() {
        return agencyRepository.findAll().stream()
                .map(agencyMapper::fromAgency)
                .collect(Collectors.toList());
    }

    @Override
    public AgencyDTO getAgency(Long id) {
        Agency agency = agencyRepository.findById(id).orElseThrow(() -> new RuntimeException("Agency not found"));
        return agencyMapper.fromAgency(agency);
    }

    @Override
    public VehicleDTO saveVehicle(VehicleDTO vehicleDTO, Long agencyId) {
        Agency agency = agencyRepository.findById(agencyId).orElseThrow(() -> new RuntimeException("Agency not found"));
        Vehicle vehicle;
        if (vehicleDTO instanceof CarDTO) {
            vehicle = vehicleMapper.fromCarDTO((CarDTO) vehicleDTO);
        } else {
            vehicle = vehicleMapper.fromMotorcycleDTO((MotorcycleDTO) vehicleDTO);
        }
        vehicle.setAgency(agency);
        return vehicleMapper.fromVehicle(vehicleRepository.save(vehicle));
    }

    @Override
    public List<VehicleDTO> listVehicles() {
        return vehicleRepository.findAll().stream()
                .map(vehicleMapper::fromVehicle)
                .collect(Collectors.toList());
    }

    @Override
    public List<VehicleDTO> getVehiclesByAgency(Long agencyId) {
        Agency agency = agencyRepository.findById(agencyId).orElseThrow(() -> new RuntimeException("Agency not found"));
        return agency.getVehicles().stream()
                .map(vehicleMapper::fromVehicle)
                .collect(Collectors.toList());
    }

    @Override
    public RentalDTO saveRental(RentalDTO rentalDTO) {
        Vehicle vehicle = vehicleRepository.findById(rentalDTO.getVehicleId())
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
        Rental rental = rentalMapper.fromRentalDTO(rentalDTO);
        rental.setVehicle(vehicle);
        return rentalMapper.fromRental(rentalRepository.save(rental));
    }

    @Override
    public List<RentalDTO> listRentals() {
        return rentalRepository.findAll().stream()
                .map(rentalMapper::fromRental)
                .collect(Collectors.toList());
    }

    @Override
    public List<RentalDTO> getRentalHistoryByVehicle(Long vehicleId) {
        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
        return vehicle.getRentals().stream()
                .map(rentalMapper::fromRental)
                .collect(Collectors.toList());
    }
}
