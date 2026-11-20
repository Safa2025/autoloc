package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Client;
import com.serinity.autoloc.services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("client")
public class ClientController {
    private final IClientService clientService;

    @PostMapping("/ajouter")
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @DeleteMapping("/supprimer/{idClient}")
    public void supprimerClient(@PathVariable Long idClient) {
        clientService.supprimerClient(idClient);
    }

    @GetMapping("/getbyId/{idClient}")
    public Client consulterClientById(@PathVariable Long idClient) {
        return clientService.consulterClientById(idClient);
    }

    @PutMapping
    public Client modifierClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }

    @GetMapping
    public List<Client> consulterClients() {
        return clientService.consulterClients();
    }

}