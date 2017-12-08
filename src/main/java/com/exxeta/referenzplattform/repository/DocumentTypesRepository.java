package com.exxeta.referenzplattform.repository;

import com.exxeta.referenzplattform.domain.DocumentTypes;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the DocumentTypes entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DocumentTypesRepository extends JpaRepository<DocumentTypes, Long> {

}
