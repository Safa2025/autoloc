package com.serinity.autoloc.services.impl;

import com.serinity.autoloc.entities.Vehicule;
import com.serinity.autoloc.repositories.VehiculeRepository;
import com.serinity.autoloc.services.IVehiculeService;
import com.serinity.autoloc.entities.Equipement;
import com.serinity.autoloc.repositories.EquipementRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {

    private final VehiculeRepository vehiculeRepository;
    private final EquipementRepository equipementRepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule modifierVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> consulterVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule consulterVehiculeById(Long idVehicule) {
        return vehiculeRepository.findById(idVehicule).orElse(null);
    }

    @Override
    public void supprimerVehicule(Long idVehicule) {
        vehiculeRepository.deleteById(idVehicule);
    }

    @Override
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();
        if (vehicule.getEquipements() == null) {
            vehicule.setEquipements(new ArrayList<>());
        }
        if (!vehicule.getEquipements().contains(equipement)) {
            vehicule.getEquipements().add(equipement);
        }
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();
        if (vehicule.getEquipements() != null) {
            vehicule.getEquipements().remove(equipement);
        }
        return vehiculeRepository.save(vehicule);
    }

    @Scheduled(initialDelay = 5000, fixedRate = 60000)
    public void actualiserEtatVehicules() {
        List<Vehicule> vehicules = vehiculeRepository.findAll();
        String date = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("[" + date + "] Actualisation des véhicules");
        System.out.println("Nombre total de véhicules : " + vehicules.size());
    }
}