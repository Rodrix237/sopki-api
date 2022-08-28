package com.seanjacksonservices.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Timestamp admin_joinedOn, admin_leftOn, lastSyncDate;
    private Integer contracts, assets, defective, prospects, rejections;
    private String profile_firstName, profile_gender, profile_lastName, contact_mobile, contact_fullNumber, contact_countryCode, contact_address, contact_email, contact_secondaryPhone,
            email, country, ccy, role, countryCode, agentNumber, location_gps_longitude, location_gps_latitude, location_country, location_county, location_district, location_commune,
            location_region, location_address, location_village, location_state, location_arrondissement, location_zone, cashCollection,
            profile_birthday, contact_secondaryMobile, position, n2_profile_firstName, n2_profile_gender, n2_profile_birthday, n2_profile_lastName, n2_agentNumber,
            n1_profile_firstName, n1_profile_gender, n1_profile_birthday, n1_profile_lastName, n1_agentNumber, team_name;
}
