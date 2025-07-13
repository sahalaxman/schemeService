package com.infoservice.schemeService.schemeRepositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoservice.schemeService.schemeEntities.SchemeProcess;

public interface SchemeProcessRepository extends JpaRepository<SchemeProcess, Long> {

    Optional<List<SchemeProcess>> findBySchemeName(String schemeName);
    // Additional query methods can be defined here if needed
    
}
