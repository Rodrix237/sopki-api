package com.seanjacksonservices.service;

import com.seanjacksonservices.model.Client;
import com.seanjacksonservices.model.Kit;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    Optional<Client> findOne(Integer id);
    Client findByKit(Kit kit);
    List <Client> findAll();
    void save(Client client);
    void update(Client client);
    void delete(Client client);

}
