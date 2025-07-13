package com.infoservice.schemeService.schemeControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infoservice.schemeService.schemeEntities.SchemeDetails;
import com.infoservice.schemeService.schemeServices.SchemeDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/scheme-details")
public class SchemeDetailsController {

    @Autowired
    private  SchemeDetailsService schemeDetailsService;
    
    @GetMapping("/demo")
    public String demoController(){
        return "Hello Controller" + schemeDetailsService.demoService();
    }

    @PostMapping("/create")
    public ResponseEntity<?> createNewScheme(@RequestBody SchemeDetails newSchemeDetails) {
        return ResponseEntity.ok(schemeDetailsService.createNewScheme(newSchemeDetails));
    }

    @GetMapping("/getall")
    public List<SchemeDetails> getAllSchemes() {
        
        
        List<SchemeDetails> s = schemeDetailsService.readAllSchemes();
        return s;
    }

    @GetMapping("/get/{id}")
    public SchemeDetails getSchemeDetailsById(@PathVariable Long id){
        SchemeDetails s = schemeDetailsService.readSchemeDetailsById(id);
        return s;
    }

    @GetMapping("/name/{schemeName}")
    public SchemeDetails getSchemeDetailsByschemeName(@PathVariable String schemeName){
        SchemeDetails s = schemeDetailsService.readSchemeDetailsBySchemeName(schemeName);
        return s;
    }

    
    @PutMapping("/put/{id}")
    public ResponseEntity<SchemeDetails> updateSchemeDetails(@PathVariable Long id, @RequestBody SchemeDetails schemeDetails) {
        return ResponseEntity.ok(schemeDetailsService.updateSchemeDetailsById(id, schemeDetails));
    }

   
    @PutMapping("/change-published-status/{id}")
    public ResponseEntity<SchemeDetails> changePublishedStatus(@PathVariable Long id) {
        return ResponseEntity.ok(schemeDetailsService.changePublishedStatus(id));
    }

    
    @PutMapping("/change-active-status/{id}")
    public ResponseEntity<SchemeDetails> changeActiveStatus(@PathVariable Long id) {
        return ResponseEntity.ok(schemeDetailsService.changeActiveStatus(id));
    }
    
}
