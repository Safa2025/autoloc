package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Client;
import java.util.List;

public interface IClientService {
    Client add(Client client);
    Client update(Client client);
    void delete(Long id);
    Client findById(Long id);
    List<Client> findAll();
}