package com.exxeta.referenzplattform.repository;

import com.exxeta.referenzplattform.domain.CustomerReferences;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * Spring Data JPA repository for the CustomerReferences entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CustomerReferencesRepository extends JpaRepository<CustomerReferences, Long> {
    @Query("select distinct customer_references from CustomerReferences customer_references left join fetch customer_references.projectroles left join fetch customer_references.servicecomponents")
    List<CustomerReferences> findAllWithEagerRelationships();

    @Query("select customer_references from CustomerReferences customer_references left join fetch customer_references.projectroles left join fetch customer_references.servicecomponents where customer_references.id =:id")
    CustomerReferences findOneWithEagerRelationships(@Param("id") Long id);

}
