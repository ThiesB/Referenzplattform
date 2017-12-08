package com.exxeta.referenzplattform.service.mapper;

import com.exxeta.referenzplattform.domain.*;
import com.exxeta.referenzplattform.service.dto.CustomerReferencesDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity CustomerReferences and its DTO CustomerReferencesDTO.
 */
@Mapper(componentModel = "spring", uses = {ConsultingDivisionMapper.class, CustomersMapper.class, IndustriesMapper.class, ProjectRolesMapper.class, ServiceComponentsMapper.class})
public interface CustomerReferencesMapper extends EntityMapper<CustomerReferencesDTO, CustomerReferences> {

    @Mapping(source = "consultingdivision.id", target = "consultingdivisionId")
    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "industry.id", target = "industryId")
    CustomerReferencesDTO toDto(CustomerReferences customerReferences); 

    @Mapping(target = "downloads", ignore = true)
    @Mapping(source = "consultingdivisionId", target = "consultingdivision")
    @Mapping(source = "customerId", target = "customer")
    @Mapping(source = "industryId", target = "industry")
    CustomerReferences toEntity(CustomerReferencesDTO customerReferencesDTO);

    default CustomerReferences fromId(Long id) {
        if (id == null) {
            return null;
        }
        CustomerReferences customerReferences = new CustomerReferences();
        customerReferences.setId(id);
        return customerReferences;
    }
}
