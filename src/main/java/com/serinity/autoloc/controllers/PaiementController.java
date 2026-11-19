package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Paiement;
import com.serinity.autoloc.services.IPaiementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paiements")
public class PaiementController {

    private final IPaiementService service;

    public PaiementController(IPaiementService service) {
        this.service = service;
    }

    @PostMapping
    public Paiement ajouter(@RequestBody Paiement objet) {
        objet.setIdPaiement(null);
        return service.add(objet);
    }

    @GetMapping
    public List<Paiement> afficherTous() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Paiement afficherParId(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Paiement modifier(
            @PathVariable("id") Long id,
            @RequestBody Paiement objet) {

        objet.setIdPaiement(id);
        return service.update(objet);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
