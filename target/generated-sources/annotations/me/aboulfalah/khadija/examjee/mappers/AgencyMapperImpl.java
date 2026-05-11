package me.aboulfalah.khadija.examjee.mappers;

import javax.annotation.processing.Generated;
import me.aboulfalah.khadija.examjee.dtos.AgencyDTO;
import me.aboulfalah.khadija.examjee.entities.Agency;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-11T16:51:06+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class AgencyMapperImpl implements AgencyMapper {

    @Override
    public AgencyDTO fromAgency(Agency agency) {
        if ( agency == null ) {
            return null;
        }

        AgencyDTO agencyDTO = new AgencyDTO();

        agencyDTO.setAdresse( agency.getAdresse() );
        agencyDTO.setId( agency.getId() );
        agencyDTO.setNom( agency.getNom() );
        agencyDTO.setTelephone( agency.getTelephone() );
        agencyDTO.setVille( agency.getVille() );

        return agencyDTO;
    }

    @Override
    public Agency fromAgencyDTO(AgencyDTO agencyDTO) {
        if ( agencyDTO == null ) {
            return null;
        }

        Agency.AgencyBuilder agency = Agency.builder();

        agency.adresse( agencyDTO.getAdresse() );
        agency.id( agencyDTO.getId() );
        agency.nom( agencyDTO.getNom() );
        agency.telephone( agencyDTO.getTelephone() );
        agency.ville( agencyDTO.getVille() );

        return agency.build();
    }
}
