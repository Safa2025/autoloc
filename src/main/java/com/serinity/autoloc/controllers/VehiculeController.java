package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Vehicule;
import com.serinity.autoloc.services.IVehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("vehicule")
public class VehiculeController {
    private final IVehiculeService vehiculeService;

    @PostMapping("/ajouter")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @DeleteMapping("/supprimer/{idVehicule}")
    public void supprimerVehicule(@PathVariable Long idVehicule) {
        vehiculeService.supprimerVehicule(idVehicule);
    }

    @GetMapping("/getbyId/{idVehicule}")
    public Vehicule consulterVehiculeById(@PathVariable Long idVehicule) {
        return vehiculeService.consulterVehiculeById(idVehicule);
    }

    @PutMapping
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }

    @GetMapping
    public List<Vehicule> consulterVehicules() {
        return vehiculeService.consulterVehicules();
    }

    @PutMapping("/affecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule affecterEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.affecterEquipement(idVehicule, idEquipement);
    }

    @PutMapping("/desaffecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule desaffecterEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.desaffecterEquipement(idVehicule, idEquipement);
    }
}