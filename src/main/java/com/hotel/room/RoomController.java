package com.hotel.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping()
    public ResponseEntity getRooms() {
        return ResponseEntity.ok(roomService.getRooms());
    }

    @PostMapping()
    public ResponseEntity addRoom(@RequestBody Room room) {
        return ResponseEntity.ok(roomService.addRoom(room));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getRoomById(@PathVariable Integer id) {
        return ResponseEntity.ok(roomService.getRoomById(id));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity updateRoom(@PathVariable Integer id, @RequestBody Room room) {
        return ResponseEntity.ok(roomService.updateRoom(id, room));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteRoom(@PathVariable Integer id) {
        return ResponseEntity.ok(roomService.deleteRoom(id));
    }

}
