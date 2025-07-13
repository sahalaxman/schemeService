package com.infoservice.schemeService.schemeServices.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infoservice.schemeService.schemeEntities.SchemeDetails;
import com.infoservice.schemeService.schemeRepositories.SchemeDetailsRepository;
import com.infoservice.schemeService.schemeServices.SchemeDetailsService;

@Service
public class SchemeDetailsServiceImpl implements SchemeDetailsService{
    @Autowired
    private SchemeDetailsRepository schemeDetailsRepository; 

   @Override
   public String demoService() {
       return "Hello Seheme Details Service";
   } 
   @Override
   public ResponseEntity<?> createNewScheme(SchemeDetails newSchemeDetails) {
        if (isSchemeExist(newSchemeDetails.getSchemeName()))  {
            return ResponseEntity.badRequest().body("Scheme with name " + newSchemeDetails.getSchemeName() + " already exists.");
        }
        newSchemeDetails.setIsActive(false);
        newSchemeDetails.setIsPublished(false);
        
        return ResponseEntity.ok(schemeDetailsRepository.save(newSchemeDetails));
   }


    @Override
    public List<SchemeDetails> readAllSchemes() {
         List<SchemeDetails> allschemes = schemeDetailsRepository.findAll();
        //  return "Total Schemes: " + schemes.size();
        return allschemes;
    }

    @Override
    public SchemeDetails readSchemeDetailsById(Long id){
        // SchemeDetails schemeDetails = schemeDetailsRepository.findById(id).orElse(null);
        // return schemeDetails != null ? "Scheme Details: " + schemeDetails.toString() : "Scheme not found with ID: " + id;
        // return schemeDetails != null ? "Scheme Details: " + schemeDetails.findSchemeDetailsById(id);  
        return schemeDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public SchemeDetails readSchemeDetailsBySchemeName(String schemeName) {
        
        SchemeDetails ss = schemeDetailsRepository.findBySchemeName(schemeName).orElse(null);  
        System.out.println(ss);
        return ss; 
    }
    @Override
    public SchemeDetails updateSchemeDetailsById(Long id, SchemeDetails updatedDetails) {
        SchemeDetails existing = readSchemeDetailsById(id);

        existing.setSchemeName(updatedDetails.getSchemeName());
        existing.setAbbr(updatedDetails.getAbbr());
        existing.setType(updatedDetails.getType());
        existing.setSummary(updatedDetails.getSummary());
        existing.setTargetAudience(updatedDetails.getTargetAudience());
        existing.setLaunchDate(updatedDetails.getLaunchDate());
        existing.setIsPublished(updatedDetails.getIsPublished());
        existing.setIsActive(updatedDetails.getIsActive());

        return schemeDetailsRepository.save(existing);
        // return schemaDetails;
        
    }

    
    // private SchemeDetails getById(Long id) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getById'");
    // }

    @Override
    public SchemeDetails changePublishedStatus(Long id) {
        // SchemeDetails existingScheme = schemeDetailsRepository.findById(id).orElse(null);
        SchemeDetails existingSchemeDetails = readSchemeDetailsById(id);
        // if (existingSchemeDetails != null) {
        //     existingSchemeDetails.setIsPublished(isPublished);
        //     schemeDetailsRepository.save(existingSchemeDetails);
        //     return existingSchemeDetails;
        // }
        existingSchemeDetails.setIsPublished(!existingSchemeDetails.getIsPublished());
        return schemeDetailsRepository.save(existingSchemeDetails);

    }

  
    @Override
    public SchemeDetails changeActiveStatus(Long id) {
        SchemeDetails existingSchemeDetails = readSchemeDetailsById(id);
        existingSchemeDetails.setIsActive(!existingSchemeDetails.getIsActive());
        return schemeDetailsRepository.save(existingSchemeDetails);
    }

    @Override
    public Boolean isSchemeExist(String schemeName){
        return (readSchemeDetailsBySchemeName(schemeName) == null) ? false : true;
    }
   
}
