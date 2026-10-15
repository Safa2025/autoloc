package com.serinity.autoloc.services.impl;

import com.serinity.autoloc.entities.Employe;
import com.serinity.autoloc.repositories.EmployeRepository;
import com.serinity.autoloc.services.IEmployeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements IEmployeService {

    private final EmployeRepository employeRepository;

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
}