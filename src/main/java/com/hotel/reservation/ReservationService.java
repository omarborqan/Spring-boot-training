package com.hotel.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    public Reservation addReservation(Reservation reservation) {
        if (reservationRepository.existsById(reservation.getId())) {
            return null;
        }
        reservationRepository.save(reservation);
        return reservationRepository.findById(reservation.getId()).get();
    }


    public Reservation getReservationById(Integer id) {
        return reservationRepository.findById(id).isEmpty() ?
                null : reservationRepository.findById(id).get();
    }

    public Reservation updateReservation(Integer id, Reservation reservation) {
        if (reservation.getId() == id && reservationRepository.existsById(reservation.getId())) {
            reservationRepository.findById(id).get().setCustomer(reservation.getCustomer());
            reservationRepository.findById(id).get().setRoom(reservation.getRoom());
            return reservation;
        }
        return null;
    }

    public List<Reservation> deleteReservation(Integer id) {
        reservationRepository.deleteById(id);
        return reservationRepository.findAll();
    }
}
