package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat add(Contrat contrat);
    Contrat update(Contrat contrat);
    void delete(Long id);
    Contrat findById(Long id);
    List<Contrat> findAll();
}