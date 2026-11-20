package com.serinity.autoloc.services.impl;

import com.serinity.autoloc.entities.Contrat;
import com.serinity.autoloc.repositories.ContratRepository;
import com.serinity.autoloc.services.IContratService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements IContratService {

    private final ContratRepository contratRepository;

    @Override
    public Contrat ajoutercontrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> consulterContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat consulterContratById(Long idContrat) {
        return contratRepository.findById(idContrat).orElse(null);
    }

    @Override
    public void supprimerContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);
    }

}