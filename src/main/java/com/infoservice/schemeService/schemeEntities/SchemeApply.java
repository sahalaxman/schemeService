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
@Table(name = "scheme-apply")
public class SchemeApply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name ="scheme-name")
    String schemeName;

    @Column(name = "mode")
    Boolean mode;

    @Column(name = "url")
    String url;

    @Column(name = "Office_address")
    String office_address;

}
