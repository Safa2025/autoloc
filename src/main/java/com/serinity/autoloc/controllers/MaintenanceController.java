package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Maintenance;
import com.serinity.autoloc.services.IMaintenanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maintenances")
public class MaintenanceController {

    private final IMaintenanceService service;

    public MaintenanceController(IMaintenanceService service) {
        this.service = service;
    }

    @PostMapping
    public Maintenance ajouter(@RequestBody Maintenance objet) {
        objet.setIdMaintenance(null);
        return service.add(objet);
    }

    @GetMapping
    public List<Maintenance> afficherTous() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Maintenance afficherParId(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Maintenance modifier(
            @PathVariable("id") Long id,
            @RequestBody Maintenance objet) {

        objet.setIdMaintenance(id);
        return service.update(objet);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
