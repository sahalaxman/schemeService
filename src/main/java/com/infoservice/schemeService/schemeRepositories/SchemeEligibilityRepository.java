package com.infoservice.schemeService.schemeRepositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoservice.schemeService.schemeEntities.SchemeEligibility;


public interface SchemeEligibilityRepository extends JpaRepository<SchemeEligibility, Long> {
    
    List<SchemeEligibility> findBySchemeId(Long schemeId);
}
