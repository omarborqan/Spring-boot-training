package com.hotel.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    public Room addRoom(Room room) {
        if (roomRepository.existsById(room.getId())) {
            return null;
        }
        roomRepository.save(room);
        return roomRepository.findById(room.getId()).get();
    }


    public Room getRoomById(Integer id) {
        return roomRepository.findById(id).isEmpty() ?
                null : roomRepository.findById(id).get();
    }

    public Room updateRoom(Integer id, Room room) {
        if (room.getId() == id && roomRepository.existsById(room.getId())) {
            roomRepository.findById(id).get().setPrice(room.getPrice());
            roomRepository.findById(id).get().setReservations(room.getReservations());
            return room;
        }
        return null;
    }

    public List<Room> deleteRoom(Integer id) {
        roomRepository.deleteById(id);
        return roomRepository.findAll();
    }

    public boolean roomExist(Integer id) {
        return roomRepository.existsById(id);
    }
}
