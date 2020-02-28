package com.hotel.attendance;

import com.hotel.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping()
    public ResponseEntity getAttendances() {
        return ResponseEntity.ok(attendanceService.getAttendances());
    }

    @PostMapping()
    public ResponseEntity addAttendance(@RequestBody Attendance attendance) {
        return ResponseEntity.ok(attendanceService.addAttendance(attendance));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getAttendanceById(@PathVariable Integer id) {
        return ResponseEntity.ok(attendanceService.getAttendanceById(id));

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity updateAttendance(@PathVariable Integer id, @RequestBody Attendance attendance) {
       return ResponseEntity.ok(attendanceService.addAttendance(attendance));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteAttendance(@PathVariable Integer id) {
        return ResponseEntity.ok(attendanceService.deleteAttendance(id));
    }

    @PostMapping(value = "/checkin")
    public ResponseEntity checkIn(@RequestBody Employee employee) {
        return ResponseEntity.ok(attendanceService.checkIn(employee));
    }

//    @PutMapping(value = "/checkout")
//    public ResponseEntity checkOut(@RequestBody Employee employee) {
//        return ResponseEntity.ok(attendanceService.checkOut(employee));
//    }
}
