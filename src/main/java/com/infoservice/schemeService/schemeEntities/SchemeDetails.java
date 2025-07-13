package com.infoservice.schemeService.schemeEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "scheme-details")
public class SchemeDetails {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column(name = "scheme-name")
    String schemeName;
    
    @Column(name = "abbr")
    String abbr;
    
    @Column(name = "type")
    String type;
    
    @Column(name = "summary")
    String summary;

    @Column(name = "target-audience")
    String targetAudience;

    @Column(name = "launch-date")
    String launchDate;

    @Column(name = "is-published")
    Boolean isPublished;

    @Column(name = "is-active")
    Boolean isActive;

    // Boolean isEligibilityAdded;
    // Boolean isProcessAdded;
    // Boolean isHowToApplyAdded;
    // Boolean isContactPersonAdded;
    
}
