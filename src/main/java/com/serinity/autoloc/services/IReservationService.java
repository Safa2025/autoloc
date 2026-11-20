package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    Reservation modifierReservation(Reservation reservation);
    List<Reservation> consulterReservations();
    Reservation consulterReservationByID(Long idReservation);
    void supprimerReservation(Long idReservation);
}