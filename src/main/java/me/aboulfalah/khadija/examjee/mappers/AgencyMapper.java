package me.aboulfalah.khadija.examjee.mappers;

import me.aboulfalah.khadija.examjee.dtos.AgencyDTO;
import me.aboulfalah.khadija.examjee.entities.Agency;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AgencyMapper {
    AgencyDTO fromAgency(Agency agency);
    Agency fromAgencyDTO(AgencyDTO agencyDTO);
}
