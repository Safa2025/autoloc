package com.serinity.autoloc.services.impl;

import com.serinity.autoloc.entities.Reservation;
import com.serinity.autoloc.repositories.ReservationRepository;
import com.serinity.autoloc.services.IReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> consulterReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation consulterReservationByID(Long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public void supprimerReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);
    }

}