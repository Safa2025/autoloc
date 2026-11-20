package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat ajoutercontrat(Contrat contrat);
    Contrat modifierContrat(Contrat contrat);
    List<Contrat> consulterContrats();
    Contrat consulterContratById(Long idContrat);
    void supprimerContrat(Long idContrat);
}