package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Client;
import com.serinity.autoloc.services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("clients")
public class ClientController {

    private final IClientService service;


    @PostMapping("/addclient")
    public Client ajouter(@RequestBody Client objet) {
        objet.setIdClient(null);
        return service.add(objet);
    }

    @GetMapping
    public List<Client> afficherTous() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Client afficherParId(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Client modifier(
            @PathVariable("id") Long id,
            @RequestBody Client objet) {

        objet.setIdClient(id);
        return service.update(objet);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
