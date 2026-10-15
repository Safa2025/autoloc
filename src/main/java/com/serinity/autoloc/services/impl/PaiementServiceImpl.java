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
    public Paiement add(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement update(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void delete(Long id) {
        paiementRepository.deleteById(id);
    }

    @Override
    public Paiement findById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }
}