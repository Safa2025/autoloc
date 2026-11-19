package com.serinity.autoloc.controllers;

import com.serinity.autoloc.entities.Reservation;
import com.serinity.autoloc.services.IReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    private final IReservationService service;

    public ReservationController(IReservationService service) {
        this.service = service;
    }

    @PostMapping
    public Reservation ajouter(@RequestBody Reservation objet) {
        objet.setIdReservation(null);
        return service.add(objet);
    }

    @GetMapping
    public List<Reservation> afficherTous() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Reservation afficherParId(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Reservation modifier(
            @PathVariable("id") Long id,
            @RequestBody Reservation objet) {

        objet.setIdReservation(id);
        return service.update(objet);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
