package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Paiement;
import java.util.List;

public interface IPaiementService {
    Paiement add(Paiement paiement);
    Paiement update(Paiement paiement);
    void delete(Long id);
    Paiement findById(Long id);
    List<Paiement> findAll();
}