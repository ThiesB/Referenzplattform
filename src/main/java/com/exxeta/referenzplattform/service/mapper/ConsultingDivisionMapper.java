package com.exxeta.referenzplattform.service.mapper;

import com.exxeta.referenzplattform.domain.*;
import com.exxeta.referenzplattform.service.dto.ConsultingDivisionDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity ConsultingDivision and its DTO ConsultingDivisionDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ConsultingDivisionMapper extends EntityMapper<ConsultingDivisionDTO, ConsultingDivision> {

    

    

    default ConsultingDivision fromId(Long id) {
        if (id == null) {
            return null;
        }
        ConsultingDivision consultingDivision = new ConsultingDivision();
        consultingDivision.setId(id);
        return consultingDivision;
    }
}
