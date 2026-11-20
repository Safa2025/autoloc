package com.serinity.autoloc.services.impl;

import com.serinity.autoloc.entities.Employe;
import com.serinity.autoloc.repositories.EmployeRepository;
import com.serinity.autoloc.services.IEmployeService;
import com.serinity.autoloc.entities.Agence;
import com.serinity.autoloc.repositories.AgenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements IEmployeService {

    private final EmployeRepository employeRepository;
    private final AgenceRepository agenceRepository;

    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> consulterEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe consulterEmployeById(Long idEmploye) {
        return employeRepository.findById(idEmploye).orElse(null);
    }

    @Override
    public void supprimerEmploye(Long idEmploye) {
        employeRepository.deleteById(idEmploye);
    }

    @Override
    public Employe desaffecterEmploye(Long idEmploye) {
        Employe employe = employeRepository.findById(idEmploye).get();
        employe.setAgence(null);
        return employeRepository.save(employe);
    }

    @Override
    public Employe affecterEmploye(Long idEmploye, Long idAgence) {
        Employe employe = employeRepository.findById(idEmploye).get();
        Agence agence = agenceRepository.findById(idAgence).get();
        employe.setAgence(agence);
        return employeRepository.save(employe);
    }
}