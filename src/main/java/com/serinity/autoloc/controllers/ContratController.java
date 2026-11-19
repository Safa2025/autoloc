package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Contrat;
import com.serinity.autoloc.services.IContratService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contrats")
public class ContratController {

    private final IContratService service;

    public ContratController(IContratService service) {
        this.service = service;
    }

    @PostMapping
    public Contrat ajouter(@RequestBody Contrat objet) {
        objet.setIdContrat(null);
        return service.add(objet);
    }

    @GetMapping
    public List<Contrat> afficherTous() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Contrat afficherParId(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Contrat modifier(
            @PathVariable("id") Long id,
            @RequestBody Contrat objet) {

        objet.setIdContrat(id);
        return service.update(objet);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
