package com.infoservice.schemeService.schemeServices.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infoservice.schemeService.schemeEntities.SchemeEligibility;
import com.infoservice.schemeService.schemeRepositories.SchemeEligibilityRepository;
import com.infoservice.schemeService.schemeServices.SchemeEligibilityService;

@Service
public class SchemeEligibilityServiceimpl implements SchemeEligibilityService{

    @Autowired
    private SchemeEligibilityRepository schemeEligibilityRepository;
    @Override
    public String demoService() {
        return "Hello Seheme Details Service";
    }

    @Override
    public SchemeEligibility createNewSchemeEligibility(SchemeEligibility newSchemeEligibility) {
       SchemeEligibility schemeEligibility = schemeEligibilityRepository.save(newSchemeEligibility);
       return schemeEligibility;
    }

    @Override
    public List<SchemeEligibility> readAllSchemeEligibility() {
        List<SchemeEligibility> schemeEligibilityList = schemeEligibilityRepository.findAll();
        return schemeEligibilityList; 
    }

    @Override
    public SchemeEligibility readAllSchemeEligibilityById(Long id) {
        return schemeEligibilityRepository.findById(id).orElse(null);
    }

    @Override
    public List<SchemeEligibility> readSchemeEligibilityBySchemeName(String schemeName) {
        List<SchemeEligibility> ss = schemeEligibilityRepository.findBySchemeName(schemeName).orElse(null);
        System.out.println(ss);
        return ss;
    }

   



    @Override
    public SchemeEligibility updateSchemeEligibilityById(Long id, SchemeEligibility updateEligibility) {
        SchemeEligibility existingEligibility = readAllSchemeEligibilityById(id);

        existingEligibility.setSchemeName(updateEligibility.getSchemeName());
        existingEligibility.setSlNo(updateEligibility.getSlNo());
        existingEligibility.setEligibility(updateEligibility.getEligibility());

        return schemeEligibilityRepository.save(existingEligibility);

        // return existingEligibility;
    }

    
}
