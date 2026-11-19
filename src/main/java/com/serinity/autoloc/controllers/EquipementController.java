package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Equipement;
import com.serinity.autoloc.services.IEquipementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipements")
public class EquipementController {

    private final IEquipementService service;

    public EquipementController(IEquipementService service) {
        this.service = service;
    }

    @PostMapping
    public Equipement ajouter(@RequestBody Equipement objet) {
        objet.setIdEquipement(null);
        return service.add(objet);
    }

    @GetMapping
    public List<Equipement> afficherTous() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Equipement afficherParId(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Equipement modifier(
            @PathVariable("id") Long id,
            @RequestBody Equipement objet) {

        objet.setIdEquipement(id);
        return service.update(objet);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
