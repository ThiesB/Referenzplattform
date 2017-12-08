package com.exxeta.referenzplattform.repository;

import com.exxeta.referenzplattform.domain.ServiceComponents;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the ServiceComponents entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ServiceComponentsRepository extends JpaRepository<ServiceComponents, Long> {

}
