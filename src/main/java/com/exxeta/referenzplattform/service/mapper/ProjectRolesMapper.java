package com.exxeta.referenzplattform.service.mapper;

import com.exxeta.referenzplattform.domain.*;
import com.exxeta.referenzplattform.service.dto.ProjectRolesDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity ProjectRoles and its DTO ProjectRolesDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ProjectRolesMapper extends EntityMapper<ProjectRolesDTO, ProjectRoles> {

    

    

    default ProjectRoles fromId(Long id) {
        if (id == null) {
            return null;
        }
        ProjectRoles projectRoles = new ProjectRoles();
        projectRoles.setId(id);
        return projectRoles;
    }
}
