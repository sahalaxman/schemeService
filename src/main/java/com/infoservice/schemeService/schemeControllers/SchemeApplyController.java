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

import com.infoservice.schemeService.schemeEntities.SchemeApply;

import com.infoservice.schemeService.schemeServices.SchemeApplyService;

@RestController
@RequestMapping("/api/scheme-apply")
public class SchemeApplyController {
    
    @Autowired
    private SchemeApplyService schemeApplyService;

    @GetMapping("/demo")
    public String demoController(){
        return "Hello Controller" + schemeApplyService.demoService();
    }

    @PostMapping("/create")
    public ResponseEntity<?>  creatSchemeApply(@RequestBody SchemeApply newSchemeApply){
        return ResponseEntity.ok(schemeApplyService.createNewSchemeApply(newSchemeApply));
    }

    @GetMapping("/get-all-scheme-apply")
    public List<SchemeApply> getAllSchemeApply(){
        List<SchemeApply> s = schemeApplyService.readAllSchemeApply();
        return s;
    }

    @GetMapping("/get-all-scheme-apply/{Id}")
    public SchemeApply getSchemeApplyById(@PathVariable Long Id){
        SchemeApply c = schemeApplyService.readAllSchemeApplyById(Id);
        return c;
    }

    @GetMapping("/get-scheme-apply/{schemeName}")
    public SchemeApply getSchemeApplyBySchemeName(@PathVariable String schemeName){
        SchemeApply s = schemeApplyService.readSchemeApplyBySchemeName(schemeName);
        return s;
    }

    @PutMapping("/update-scheme-apply/{id}")
    public ResponseEntity<SchemeApply> updateSchemeApplyById(@PathVariable Long id,@RequestBody SchemeApply schemeApply){
        return ResponseEntity.ok(schemeApplyService.updateSchemeApplyById(id, schemeApply));
    }

    @PutMapping("/change-mode-status/{id}")
    public ResponseEntity<SchemeApply> changeModeStatus(@PathVariable Long id){
        return ResponseEntity.ok(schemeApplyService.changeModeStatus(id));
    }


}
