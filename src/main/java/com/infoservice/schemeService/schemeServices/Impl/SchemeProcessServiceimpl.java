package com.infoservice.schemeService.schemeServices.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.infoservice.schemeService.schemeEntities.SchemeEligibility;
import com.infoservice.schemeService.schemeEntities.SchemeProcess;
import com.infoservice.schemeService.schemeRepositories.SchemeProcessRepository;
import com.infoservice.schemeService.schemeServices.SchemeProcessService;

@Service
public class SchemeProcessServiceimpl implements SchemeProcessService{

    @Autowired
    private SchemeProcessRepository schemeProcessRepository;
    
    @Override
    public String demoService() {
        return "Hello Scheme Process Service";
    }

    @Override
    public SchemeProcess createNewSchemeProcess(SchemeProcess newSchemeProcess) {
        SchemeProcess schemeProcess = schemeProcessRepository.save(newSchemeProcess);
       return schemeProcess;
    }

    @Override
    public List<SchemeProcess> readAllSchemeProcess() {
         List<SchemeProcess> schemeProcessList = schemeProcessRepository.findAll();
        return schemeProcessList;
       
    }

    @Override
    public SchemeProcess readAllSchemeProcessById(Long id) {
        return schemeProcessRepository.findById(id).orElse(null);
    }

    // @Override
    // public List<SchemeProcess> readSchemeProcessBySchemeName(String schemeName) {
    //    List<SchemeProcess> ss = schemeProcessRepository.findBySchemeName(schemeName).orElse(null);
    //     return ss;
    // }
    @Override
    public List<SchemeProcess> getSchemeProcessById(Long schemeId) {
        List<SchemeProcess> data = schemeProcessRepository.findBySchemeId(schemeId);
        return data;
    }

    @Override
    public SchemeProcess updateSchemeProcessById(Long id, SchemeProcess updateProcess) {
        SchemeProcess existingProcess = readAllSchemeProcessById(id);

        existingProcess.setSchemeId(updateProcess.getSchemeId());
        existingProcess.setStepNo(updateProcess.getStepNo());
        existingProcess.setDetails(updateProcess.getDetails());

        return schemeProcessRepository.save(existingProcess);
    }

    
}
