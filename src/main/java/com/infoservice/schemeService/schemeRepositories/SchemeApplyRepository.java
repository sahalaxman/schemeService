package com.infoservice.schemeService.schemeRepositories;

// import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoservice.schemeService.schemeEntities.SchemeApply;

public interface SchemeApplyRepository extends JpaRepository<SchemeApply, Long> {

    Optional<SchemeApply> findBySchemeName(String schemeName);
    // Additional query methods can be defined here if needed
    
}
