package com.serinity.autoloc.services.impl;

import com.serinity.autoloc.entities.Agence;
import com.serinity.autoloc.entities.Employe;
import com.serinity.autoloc.repositories.AgenceRepository;
import com.serinity.autoloc.repositories.EmployeRepository;
import com.serinity.autoloc.services.IEmployeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements IEmployeService {

    private final EmployeRepository employeRepository;
    private final AgenceRepository agenceRepository;

    @Override
    public Employe add(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe update(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void delete(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public Employe findById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employe> findAll() {
        return employeRepository.findAll();
    }

    @Override
    public Employe desaffecterEmploye(Long idEmploye) {
        Employe employe = employeRepository.findById(idEmploye)
            .orElseThrow(() -> new RuntimeException("Employé introuvable : " + idEmploye));
        employe.setAgence(null);
        return employeRepository.save(employe);
    }

    @Override
    public Employe affecterEmploye(Long idEmploye, Long idAgence) {
        Employe employe = employeRepository.findById(idEmploye)
            .orElseThrow(() -> new RuntimeException("Employé introuvable : " + idEmploye));
        Agence agence = agenceRepository.findById(idAgence)
            .orElseThrow(() -> new RuntimeException("Agence introuvable : " + idAgence));
        employe.setAgence(agence);
        return employeRepository.save(employe);
    }
}