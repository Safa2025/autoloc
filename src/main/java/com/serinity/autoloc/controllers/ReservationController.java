package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Reservation;
import com.serinity.autoloc.services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("reservation")
public class ReservationController {
    private final IReservationService reservationService;

    @PostMapping("/ajouter")
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return reservationService.ajouterReservation(reservation);
    }

    @DeleteMapping("/supprimer/{idReservation}")
    public void supprimerReservation(@PathVariable Long idReservation) {
        reservationService.supprimerReservation(idReservation);
    }

    @GetMapping("/getbyId/{idReservation}")
    public Reservation consulterReservationById(@PathVariable Long idReservation) {
        return reservationService.consulterReservationByID(idReservation);
    }

    @PutMapping
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return reservationService.modifierReservation(reservation);
    }

    @GetMapping
    public List<Reservation> consulterReservations() {
        return reservationService.consulterReservations();
    }

}