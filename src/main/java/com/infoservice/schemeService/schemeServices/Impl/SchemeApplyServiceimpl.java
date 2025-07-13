package com.infoservice.schemeService.schemeServices.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infoservice.schemeService.schemeEntities.SchemeApply;

import com.infoservice.schemeService.schemeRepositories.SchemeApplyRepository;
import com.infoservice.schemeService.schemeServices.SchemeApplyService;

@Service
public class SchemeApplyServiceimpl  implements SchemeApplyService {

    // private static final Boolean offline = false;
    // private static final Boolean online = true;
    @Autowired
    private SchemeApplyRepository schemeApplyRepository;

    @Override
    public String demoService() {
         return "Hello Seheme Apply Service";
    }

    @Override
    public ResponseEntity<?> createNewSchemeApply(SchemeApply newSchemeApply) {
        if (isSchemeExist(newSchemeApply.getSchemeName()))  {
            return ResponseEntity.badRequest().body("Scheme with name " + newSchemeApply.getSchemeName() + " already exists.");
        }
        newSchemeApply.setMode(false);
        
        return ResponseEntity.ok(schemeApplyRepository.save(newSchemeApply));
    }
    

    @Override
    public List<SchemeApply> readAllSchemeApply() {
         List<SchemeApply> schemeApplyList = schemeApplyRepository.findAll();
        return schemeApplyList;
    }

    @Override
    public SchemeApply readAllSchemeApplyById(Long id) {
        return schemeApplyRepository.findById(id).orElse(null);
    }

    @Override
    public SchemeApply readSchemeApplyBySchemeName(String schemeName) {
        SchemeApply ss = schemeApplyRepository.findBySchemeName(schemeName).orElse(null);
        System.out.println(ss);
        return ss;
    }

    @Override
    public SchemeApply updateSchemeApplyById(Long id, SchemeApply updateApply) {
        SchemeApply existingApply = readAllSchemeApplyById(id);

        existingApply.setSchemeName(updateApply.getSchemeName());
        existingApply.setMode(updateApply.getMode());
        existingApply.setUrl(updateApply.getUrl());
        existingApply.setOffice_address(updateApply.getOffice_address());
        

        return schemeApplyRepository.save(existingApply);
    }

    @Override
    public SchemeApply changeModeStatus(Long id) {
      SchemeApply existingSchemeApply = readAllSchemeApplyById(id);
       existingSchemeApply.setMode(!existingSchemeApply.getMode());
       return schemeApplyRepository.save(existingSchemeApply);
    }

    @Override
    public Boolean isSchemeExist(String schemeName){
        return (readSchemeApplyBySchemeName(schemeName) == null) ? false : true;
    }    
}
