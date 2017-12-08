package com.exxeta.referenzplattform.repository;

import com.exxeta.referenzplattform.domain.ProjectRoles;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the ProjectRoles entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProjectRolesRepository extends JpaRepository<ProjectRoles, Long> {

}
