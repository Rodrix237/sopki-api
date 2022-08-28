package com.seanjacksonservices.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Kit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String serialnumber;
    private String fournisseur;
    private Integer jourrestant;
    private String mode;
}
