package com.hotel.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping()
    public ResponseEntity getReservations() {
        return ResponseEntity.ok(reservationService.getReservations());
    }

    @PostMapping()
    public ResponseEntity addReservation(@RequestBody Reservation reservation) {
        return ResponseEntity.ok(reservationService.addReservation(reservation));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getReservationById(@PathVariable Integer id) {
        return ResponseEntity.ok(reservationService.getReservationById(id));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity updateReservation(@PathVariable Integer id, @RequestBody Reservation reservation) {
        return ResponseEntity.ok(reservationService.updateReservation(id, reservation));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteReservation(@PathVariable Integer id) {
        return ResponseEntity.ok(reservationService.deleteReservation(id));
    }

}
