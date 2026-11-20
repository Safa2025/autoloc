package com.serinity.autoloc.services.impl;

import com.serinity.autoloc.entities.Maintenance;
import com.serinity.autoloc.repositories.MaintenanceRepository;
import com.serinity.autoloc.services.IMaintenanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance modifierMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public List<Maintenance> consulterMaintenance() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance consulterMaintenanceById(Long idMaintenance) {
        return maintenanceRepository.findById(idMaintenance).orElse(null);
    }

    @Override
    public void supprimerMaintenance(Long idMaintenance) {
        maintenanceRepository.deleteById(idMaintenance);
    }

}