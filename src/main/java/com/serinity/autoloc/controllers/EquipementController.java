package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Equipement;
import com.serinity.autoloc.services.IEquipementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("equipement")
public class EquipementController {
    private final IEquipementService equipementService;

    @PostMapping("/ajouter")
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementService.ajouterEquipement(equipement);
    }

    @DeleteMapping("/supprimer/{idEquipement}")
    public void supprimerEquipement(@PathVariable Long idEquipement) {
        equipementService.supprimerEquipement(idEquipement);
    }

    @GetMapping("/getbyId/{idEquipement}")
    public Equipement consulterEquipementById(@PathVariable Long idEquipement) {
        return equipementService.consulterEquipementById(idEquipement);
    }

    @PutMapping
    public Equipement modifierEquipement(@RequestBody Equipement equipement) {
        return equipementService.modifierEquipement(equipement);
    }

    @GetMapping
    public List<Equipement> consulterEquipements() {
        return equipementService.consulterEquipements();
    }

}