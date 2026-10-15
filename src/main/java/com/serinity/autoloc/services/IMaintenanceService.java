package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance add(Maintenance maintenance);
    Maintenance update(Maintenance maintenance);
    void delete(Long id);
    Maintenance findById(Long id);
    List<Maintenance> findAll();
}