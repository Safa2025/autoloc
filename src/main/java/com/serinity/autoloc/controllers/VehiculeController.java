package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Vehicule;
import com.serinity.autoloc.services.IVehiculeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicules")
public class VehiculeController {

    private final IVehiculeService service;

    public VehiculeController(IVehiculeService service) {
        this.service = service;
    }

    @PostMapping
    public Vehicule ajouter(@RequestBody Vehicule objet) {
        objet.setIdVehicule(null);
        return service.add(objet);
    }

    @GetMapping
    public List<Vehicule> afficherTous() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Vehicule afficherParId(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Vehicule modifier(
            @PathVariable("id") Long id,
            @RequestBody Vehicule objet) {

        objet.setIdVehicule(id);
        return service.update(objet);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
