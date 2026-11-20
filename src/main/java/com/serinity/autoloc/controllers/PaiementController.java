package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Paiement;
import com.serinity.autoloc.services.IPaiementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("paiement")
public class PaiementController {
    private final IPaiementService paiementService;

    @PostMapping("/ajouter")
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return paiementService.ajouterPaiement(paiement);
    }

    @DeleteMapping("/supprimer/{idPaiement}")
    public void supprimerPaiement(@PathVariable Long idPaiement) {
        paiementService.supprimerPaiement(idPaiement);
    }

    @GetMapping("/getbyId/{idPaiement}")
    public Paiement consulterPaiementById(@PathVariable Long idPaiement) {
        return paiementService.consulterPaiementById(idPaiement);
    }

    @PutMapping
    public Paiement modifierPaiement(@RequestBody Paiement paiement) {
        return paiementService.modifierPaiement(paiement);
    }

    @GetMapping
    public List<Paiement> consulterPaiements() {
        return paiementService.consulterPaiements();
    }

}