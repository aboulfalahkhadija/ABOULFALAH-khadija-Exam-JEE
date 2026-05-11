package me.aboulfalah.khadija.examjee.mappers;

import javax.annotation.processing.Generated;
import me.aboulfalah.khadija.examjee.dtos.AgencyDTO;
import me.aboulfalah.khadija.examjee.entities.Agency;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-11T16:18:19+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class AgencyMapperImpl implements AgencyMapper {

    @Override
    public AgencyDTO fromAgency(Agency agency) {
        if ( agency == null ) {
            return null;
        }

        AgencyDTO agencyDTO = new AgencyDTO();

        agencyDTO.setId( agency.getId() );
        agencyDTO.setNom( agency.getNom() );
        agencyDTO.setAdresse( agency.getAdresse() );
        agencyDTO.setVille( agency.getVille() );
        agencyDTO.setTelephone( agency.getTelephone() );

        return agencyDTO;
    }

    @Override
    public Agency fromAgencyDTO(AgencyDTO agencyDTO) {
        if ( agencyDTO == null ) {
            return null;
        }

        Agency.AgencyBuilder agency = Agency.builder();

        agency.id( agencyDTO.getId() );
        agency.nom( agencyDTO.getNom() );
        agency.adresse( agencyDTO.getAdresse() );
        agency.ville( agencyDTO.getVille() );
        agency.telephone( agencyDTO.getTelephone() );

        return agency.build();
    }
}
