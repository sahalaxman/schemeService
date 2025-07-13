package com.infoservice.schemeService.schemeEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "scheme-eligibility")
public class SchemeEligibility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column(name = "scheme-name")
    String schemeName;

    @Column(name = "slNo")
    Long slNo;

    @Column(name = "eligibility")
    String eligibility;

    
}
