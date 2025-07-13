package com.infoservice.schemeService.schemeRepositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoservice.schemeService.schemeEntities.SchemeDetails;

public interface SchemeDetailsRepository extends JpaRepository<SchemeDetails, Long>{

    Optional<SchemeDetails> findBySchemeName(String schemeName);

    
}
