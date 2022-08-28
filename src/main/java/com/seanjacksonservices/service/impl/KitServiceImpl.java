package com.seanjacksonservices.service.impl;

import com.seanjacksonservices.model.Kit;
import com.seanjacksonservices.repository.KitRepository;
import com.seanjacksonservices.service.KitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KitServiceImpl implements KitService {

    @Autowired
    KitRepository repository;

    @Override
    public Optional<Kit> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<Kit> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Kit kit) {
        repository.save(kit);
    }

    @Override
    public void update(Kit kit) {
        repository.save(kit);
    }

    @Override
    public void delete(Kit kit) {
        repository.delete(kit);
    }
}
