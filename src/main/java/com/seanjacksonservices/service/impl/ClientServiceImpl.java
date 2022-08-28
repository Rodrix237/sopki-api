package com.seanjacksonservices.service.impl;

import com.seanjacksonservices.model.Client;
import com.seanjacksonservices.model.Kit;
import com.seanjacksonservices.repository.ClientRepository;
import com.seanjacksonservices.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository repository;

    @Override
    public Optional<Client> findOne(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Client findByKit(Kit kit) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Client client) {
        repository.save(client);
    }

    @Override
    public void update(Client client) {
        repository.save(client);
    }

    @Override
    public void delete(Client client) {
        repository.delete(client);
    }
}
