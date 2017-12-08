package com.exxeta.referenzplattform.service.mapper;

import com.exxeta.referenzplattform.domain.*;
import com.exxeta.referenzplattform.service.dto.DocumentTypesDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity DocumentTypes and its DTO DocumentTypesDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface DocumentTypesMapper extends EntityMapper<DocumentTypesDTO, DocumentTypes> {

    

    

    default DocumentTypes fromId(Long id) {
        if (id == null) {
            return null;
        }
        DocumentTypes documentTypes = new DocumentTypes();
        documentTypes.setId(id);
        return documentTypes;
    }
}
