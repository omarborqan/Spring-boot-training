package com.hotel.room;

import com.hotel.reservation.Reservation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Room {
    @Id
    private Integer Id;

    private Integer price;

    @OneToMany(mappedBy = "room")
    private List<Reservation> reservations;


    protected Room() {

    }

    public Room(Integer id, Integer price) {
        this.Id = id;
        this.price = price;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer roomId) {
        this.Id = roomId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

}
