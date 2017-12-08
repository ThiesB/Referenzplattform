package com.exxeta.referenzplattform.service.mapper;

import com.exxeta.referenzplattform.domain.*;
import com.exxeta.referenzplattform.service.dto.IndustriesDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Industries and its DTO IndustriesDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface IndustriesMapper extends EntityMapper<IndustriesDTO, Industries> {

    

    

    default Industries fromId(Long id) {
        if (id == null) {
            return null;
        }
        Industries industries = new Industries();
        industries.setId(id);
        return industries;
    }
}
