package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Employe;
import com.serinity.autoloc.services.IEmployeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("employe")
public class EmployeController {
    private final IEmployeService employeService;

    @PostMapping("/ajouter")
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.ajouterEmploye(employe);
    }

    @DeleteMapping("/supprimer/{idEmploye}")
    public void supprimerEmploye(@PathVariable Long idEmploye) {
        employeService.supprimerEmploye(idEmploye);
    }

    @GetMapping("/getbyId/{idEmploye}")
    public Employe consulterEmployeById(@PathVariable Long idEmploye) {
        return employeService.consulterEmployeById(idEmploye);
    }

    @PutMapping
    public Employe modifierEmploye(@RequestBody Employe employe) {
        return employeService.modifierEmploye(employe);
    }

    @GetMapping
    public List<Employe> consulterEmployes() {
        return employeService.consulterEmployes();
    }

    @PutMapping("/desaffecter/{idEmploye}")
    public Employe desaffecterEmploye(@PathVariable Long idEmploye) {
        return employeService.desaffecterEmploye(idEmploye);
    }

    @PutMapping("/affecter/{idEmploye}/{idAgence}")
    public Employe affecterEmploye(@PathVariable Long idEmploye, @PathVariable Long idAgence) {
        return employeService.affecterEmploye(idEmploye, idAgence);
    }
}