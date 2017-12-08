package com.exxeta.referenzplattform.service.mapper;

import com.exxeta.referenzplattform.domain.*;
import com.exxeta.referenzplattform.service.dto.CustomersDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Customers and its DTO CustomersDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CustomersMapper extends EntityMapper<CustomersDTO, Customers> {

    

    

    default Customers fromId(Long id) {
        if (id == null) {
            return null;
        }
        Customers customers = new Customers();
        customers.setId(id);
        return customers;
    }
}
