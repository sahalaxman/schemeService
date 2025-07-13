package com.infoservice.schemeService.schemeServices;

import java.util.List;

import com.infoservice.schemeService.schemeEntities.SchemeProcess;

public interface SchemeProcessService {
    String demoService();

    SchemeProcess createNewSchemeProcess(SchemeProcess schemeProcess);

    List<SchemeProcess> readAllSchemeProcess();

    SchemeProcess readAllSchemeProcessById(Long id);

    List<SchemeProcess> readSchemeProcessBySchemeName(String schemeName);

    SchemeProcess updateSchemeProcessById(Long id, SchemeProcess schemeProcess);
}
