package com.hotel.customer;

import com.hotel.reservation.Reservation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Customer {
    @Id
    private Integer Id;

    private String name;

    @OneToMany(mappedBy = "customer")
    private List<Reservation> reservationSet;

    protected Customer() {

    }

    public Customer(Integer id, String name) {
        this.Id = id;
        this.name = name;
        this.reservationSet = reservationSet;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Reservation> getReservationSet() {
        return reservationSet;
    }

    public void setReservationSet(List<Reservation> reservationSet) {
        this.reservationSet = reservationSet;
    }


}
