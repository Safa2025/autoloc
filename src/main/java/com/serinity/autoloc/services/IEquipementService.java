package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    Equipement modifierEquipement(Equipement equipement);
    List<Equipement> consulterEquipements();
    Equipement consulterEquipementById(Long idEquipement);
    void supprimerEquipement(Long idEquipement);
}