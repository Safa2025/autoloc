package com.serinity.autoloc.services.impl;

import com.serinity.autoloc.entities.Equipement;
import com.serinity.autoloc.repositories.EquipementRepository;
import com.serinity.autoloc.services.IEquipementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementServiceImpl implements IEquipementService {

    private final EquipementRepository equipementRepository;

    @Override
    public Equipement ajouterEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement modifierEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public List<Equipement> consulterEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement consulterEquipementById(Long idEquipement) {
        return equipementRepository.findById(idEquipement).orElse(null);
    }

    @Override
    public void supprimerEquipement(Long idEquipement) {
        equipementRepository.deleteById(idEquipement);
    }

}