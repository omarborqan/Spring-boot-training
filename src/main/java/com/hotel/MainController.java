package com.hotel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping()
    public ResponseEntity getDescription() {
        return ResponseEntity.ok("HELLO THIS IS MY HOTEL MANAGEMENT SYSTEM");
    }
}
