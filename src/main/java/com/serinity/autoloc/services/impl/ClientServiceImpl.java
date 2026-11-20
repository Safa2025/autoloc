package com.serinity.autoloc.services.impl;

import com.serinity.autoloc.entities.Client;
import com.serinity.autoloc.repositories.ClientRepository;
import com.serinity.autoloc.services.IClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> consulterClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client consulterClientById(Long idClient) {
        return clientRepository.findById(idClient).orElse(null);
    }

    @Override
    public void supprimerClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }

}