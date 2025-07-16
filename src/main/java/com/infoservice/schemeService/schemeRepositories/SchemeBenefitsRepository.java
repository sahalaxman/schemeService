package com.infoservice.schemeService.schemeRepositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoservice.schemeService.schemeEntities.SchemeBenefits;


public interface SchemeBenefitsRepository extends JpaRepository<SchemeBenefits, Long>{
    List<SchemeBenefits> findBySchemeId(Long schemeId);
}
