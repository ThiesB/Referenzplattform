package com.exxeta.referenzplattform.repository;

import com.exxeta.referenzplattform.domain.Downloads;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Downloads entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DownloadsRepository extends JpaRepository<Downloads, Long> {

}
