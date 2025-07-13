package com.infoservice.schemeService.schemeServices;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.infoservice.schemeService.schemeEntities.SchemeApply;

public interface SchemeApplyService {
    String demoService();
    ResponseEntity<?> createNewSchemeApply(SchemeApply schemeApply);

    List<SchemeApply> readAllSchemeApply();
    SchemeApply readAllSchemeApplyById(Long id);
    SchemeApply readSchemeApplyBySchemeName(String schemeName);
    SchemeApply updateSchemeApplyById(Long id, SchemeApply schemeApply);
    SchemeApply changeModeStatus(Long id);

    Boolean isSchemeExist(String schemeName);
}
