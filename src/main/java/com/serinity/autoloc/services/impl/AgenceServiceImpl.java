package com.serinity.autoloc.services.impl;

import com.serinity.autoloc.entities.Agence;
import com.serinity.autoloc.repositories.AgenceRepository;
import com.serinity.autoloc.services.IAgenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgenceService {

    private final AgenceRepository agenceRepository;

    @Override
    public Agence add(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence update(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void delete(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public Agence findById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Agence> findAll() {
        return agenceRepository.findAll();
    }
}