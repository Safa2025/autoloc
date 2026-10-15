package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement add(Equipement equipement);
    Equipement update(Equipement equipement);
    void delete(Long id);
    Equipement findById(Long id);
    List<Equipement> findAll();
}