package com.infoservice.schemeService.schemeControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infoservice.schemeService.schemeEntities.SchemeEligibility;
import com.infoservice.schemeService.schemeServices.SchemeEligibilityService;

@RestController
@RequestMapping("/api/scheme-eligibility")
public class SchemeEligibilityController {
    
    @Autowired
    private SchemeEligibilityService schemeEligibilityService;

    @GetMapping("/demo")
    public String demoController(){
        return "Hello Controller" + schemeEligibilityService.demoService();
    }

    @PostMapping
    public SchemeEligibility createSchemeEligibility(@RequestBody SchemeEligibility schemeEligibility){
        return schemeEligibilityService.createNewSchemeEligibility(schemeEligibility);
    }

    @GetMapping("/get-all-scheme-eligibility")
    public List<SchemeEligibility> getAllSchemeEligibility() {
        List<SchemeEligibility> c = schemeEligibilityService.readAllSchemeEligibility();
        return c;
    }

    @GetMapping("/get-all-scheme-eligibility/{Id}")
    public SchemeEligibility getSchemeEligibilityById(@PathVariable Long Id){
        SchemeEligibility s = schemeEligibilityService.readAllSchemeEligibilityById(Id);
        return s;
    }

    @GetMapping("/get-scheme-eligibility/{schemeName}")
    public List<SchemeEligibility> getSchemeEligibilityBySchemeName(@PathVariable String schemeName){
        List<SchemeEligibility> s = schemeEligibilityService.readSchemeEligibilityBySchemeName(schemeName);
        return s;
    }

    @PutMapping("/update-scheme-eligibility/{id}")
    public ResponseEntity<SchemeEligibility> updateSchemeEligibility(@PathVariable Long id, @RequestBody SchemeEligibility schemeEligibility){
        return ResponseEntity.ok(schemeEligibilityService.updateSchemeEligibilityById(id, schemeEligibility));
    }


}
