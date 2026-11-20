package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    Maintenance modifierMaintenance(Maintenance maintenance);
    List<Maintenance> consulterMaintenance();
    Maintenance consulterMaintenanceById(Long idMaintenance);
    void supprimerMaintenance(Long idMaintenance);
}