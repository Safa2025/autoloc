package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Employe;
import com.serinity.autoloc.services.IEmployeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employes")
public class EmployeController {

    private final IEmployeService service;

    public EmployeController(IEmployeService service) {
        this.service = service;
    }

    @PostMapping
    public Employe ajouter(@RequestBody Employe objet) {
        objet.setIdEmploye(null);
        return service.add(objet);
    }

    @GetMapping
    public List<Employe> afficherTous() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Employe afficherParId(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Employe modifier(
            @PathVariable("id") Long id,
            @RequestBody Employe objet) {

        objet.setIdEmploye(id);
        return service.update(objet);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
