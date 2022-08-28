package com.seanjacksonservices.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nom;
    private String prenom;
    private Integer age;
    private String sexe;
    private String profession;
    private Integer montanttotalpaye;
    private Integer montanttotatrestant;
    private String statut;
    @ManyToOne
    private Kit kit;
}
