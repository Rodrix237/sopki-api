package com.seanjacksonservices.service;

import com.seanjacksonservices.model.Kit;

import java.util.List;
import java.util.Optional;

public interface KitService {

    Optional<Kit> findOne(Integer id);
    List <Kit> findAll();
    void save(Kit kit);
    void update(Kit kit);
    void delete(Kit kit);
}
