package com.infoservice.schemeService.schemeRepositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoservice.schemeService.schemeEntities.SchemeContactPerson;

public interface SchemeContactPersonRepository extends JpaRepository<SchemeContactPerson, Long>{

    Optional<SchemeContactPerson> findBySchemeName(String schemeName);
    
}
