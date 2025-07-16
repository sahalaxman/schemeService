package com.infoservice.schemeService.schemeServices;

import java.util.List;

import com.infoservice.schemeService.schemeEntities.SchemeBenefits;

public interface SchemeBenefitsService {

    String demoService();

    SchemeBenefits createNewSchemeBenefits(SchemeBenefits schemeBenefits);

    List<SchemeBenefits> readAllSchemeBenefits();

    SchemeBenefits readAllSchemeBenefitsById(Long id);

    List<SchemeBenefits> readSchemeBenefitsBySchemeId(Long schemeId);

    SchemeBenefits updateSchemeBenefitsById(Long id, SchemeBenefits schemeBenefits);
    
}
