package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Employe;
import java.util.List;

public interface IEmployeService {
    Employe add(Employe employe);
    Employe update(Employe employe);
    void delete(Long id);
    Employe findById(Long id);
    List<Employe> findAll();
}