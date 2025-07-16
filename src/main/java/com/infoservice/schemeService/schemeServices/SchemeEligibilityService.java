package com.infoservice.schemeService.schemeServices;

import java.util.List;

import com.infoservice.schemeService.schemeEntities.SchemeEligibility;

public interface SchemeEligibilityService {
    String demoService();

    SchemeEligibility createNewSchemeEligibility(SchemeEligibility newSchemeEligibility);

    List<SchemeEligibility> readAllSchemeEligibility();

    SchemeEligibility getEligibilityById(Long schemeId);

    List<SchemeEligibility> getSchemeEligibilityById(Long id);

    SchemeEligibility updateSchemeEligibilityById(Long id, SchemeEligibility schemeEligibility);
    // Object updatedSchemeEligibilityById(Long id, SchemeEligibility schemeEligibility);

    // Object updateSchemeEligibilityById(Long id, SchemeEligibility schemeEligibility);
}
