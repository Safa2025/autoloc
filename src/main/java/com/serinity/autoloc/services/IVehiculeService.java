package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Vehicule;
import java.util.List;

public interface IVehiculeService {
    Vehicule add(Vehicule vehicule);
    Vehicule update(Vehicule vehicule);
    void delete(Long id);
    Vehicule findById(Long id);
    List<Vehicule> findAll();
}