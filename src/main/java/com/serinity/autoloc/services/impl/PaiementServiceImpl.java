package com.serinity.autoloc.services.impl;

import com.serinity.autoloc.entities.Paiement;
import com.serinity.autoloc.repositories.PaiementRepository;
import com.serinity.autoloc.services.IPaiementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiementService {

    private final PaiementRepository paiementRepository;

    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement modifierPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> consulterPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement consulterPaiementById(Long idPaiement) {
        return paiementRepository.findById(idPaiement).orElse(null);
    }

    @Override
    public void supprimerPaiement(Long idPaiement) {
        paiementRepository.deleteById(idPaiement);
    }

}