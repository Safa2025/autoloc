package com.serinity.autoloc.services.impl;

import com.serinity.autoloc.entities.Agence;
import com.serinity.autoloc.repositories.AgenceRepository;
import com.serinity.autoloc.services.IAgenceService;
import com.serinity.autoloc.entities.Vehicule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgenceService {

    private final AgenceRepository agenceRepository;

    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public List<Agence> consulterAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence consulterAgenceById(Long idAgence) {
        return agenceRepository.findById(idAgence).orElse(null);
    }

    @Override
    public void supprimerAgence(Long idAgence) {
        agenceRepository.deleteById(idAgence);
    }

    @Override
    public Agence ajouterAgenceEtAffecterVehicules(Agence agence) {
        for (Vehicule vehicule : agence.getVehicules()) {
            vehicule.setAgence(agence);
        }
        return agenceRepository.save(agence);
    }
}