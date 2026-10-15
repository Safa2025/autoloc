package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Agence;
import java.util.List;

public interface IAgenceService {
    Agence add(Agence agence);
    Agence update(Agence agence);
    void delete(Long id);
    Agence findById(Long id);
    List<Agence> findAll();
}