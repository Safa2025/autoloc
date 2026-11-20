package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Contrat;
import com.serinity.autoloc.services.IContratService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("contrat")
public class ContratController {
    private final IContratService contratService;

    @PostMapping("/ajouter")
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajoutercontrat(contrat);
    }

    @DeleteMapping("/supprimer/{idContrat}")
    public void supprimerContrat(@PathVariable Long idContrat) {
        contratService.supprimerContrat(idContrat);
    }

    @GetMapping("/getbyId/{idContrat}")
    public Contrat consulterContratById(@PathVariable Long idContrat) {
        return contratService.consulterContratById(idContrat);
    }

    @PutMapping
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }

    @GetMapping
    public List<Contrat> consulterContrats() {
        return contratService.consulterContrats();
    }

}