package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Agence;
import com.serinity.autoloc.services.IAgenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agences")
public class AgenceController {

    private final IAgenceService service;

    public AgenceController(IAgenceService service) {
        this.service = service;
    }

    @PostMapping
    public Agence ajouter(@RequestBody Agence objet) {
        objet.setIdAgence(null);
        return service.add(objet);
    }

    @GetMapping
    public List<Agence> afficherTous() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Agence afficherParId(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Agence modifier(
            @PathVariable("id") Long id,
            @RequestBody Agence objet) {

        objet.setIdAgence(id);
        return service.update(objet);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
