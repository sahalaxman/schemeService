package com.infoservice.schemeService.schemeServices;

import java.util.List;

import com.infoservice.schemeService.schemeEntities.SchemeEligibility;

public interface SchemeEligibilityService {
    String demoService();

    SchemeEligibility createNewSchemeEligibility(SchemeEligibility newSchemeEligibility);

    List<SchemeEligibility> readAllSchemeEligibility();

    SchemeEligibility readAllSchemeEligibilityById(Long id);

    List<SchemeEligibility> readSchemeEligibilityBySchemeName(String schemeName);

    SchemeEligibility updateSchemeEligibilityById(Long id, SchemeEligibility schemeEligibility);

    // Object updatedSchemeEligibilityById(Long id, SchemeEligibility schemeEligibility);

    // Object updateSchemeEligibilityById(Long id, SchemeEligibility schemeEligibility);
}
