package com.serinity.autoloc.services;

import com.serinity.autoloc.entities.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation add(Reservation reservation);
    Reservation update(Reservation reservation);
    void delete(Long id);
    Reservation findById(Long id);
    List<Reservation> findAll();
}