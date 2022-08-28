package com.seanjacksonservices.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Timestamp dateAdded, lastUpdate, updatedAt, distributed_date, defect_date, deployDate;
    private String productDetails_name, productDetails_category, productDetails_managedBy, productDetails_manufacturer, distributed_status, defect_status, serialNumber, status,
            product_name, product_productReference, paygNumber, batchNumber, entity, heldBy_agentNumber, ownedBy_profile_firstName, ownedBy_profile_middleName, ownedBy_profile_nickName,
            ownedBy_profile_lastName, ownedBy_profile_birthday, ownedBy_profile_village, ownedBy_profile_gender, ownedBy_profile_district, ownedBy_profile_region, ownedBy_profile_country,
            ownedBy_profile_route, ownedBy_contact_countryCode, ownedBy_contact_mobile, ownedBy_contact_secondaryMobile, ownedBy_contact_fullNumber, ownedBy_clientNumber, contract_contractNumber;
    @ManyToOne
    private Agent agent;
}
