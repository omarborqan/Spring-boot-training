package com.hotel.attendance;

import com.hotel.employee.Employee;
import com.hotel.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private EmployeeService employeeService;

    AttendanceService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    public List<Attendance> getAttendances() {
        return attendanceRepository.findAll();
    }

    public Attendance addAttendance(Attendance attendance) {
        if (attendanceRepository.existsById(attendance.getId())) {
            return null;
        }
        attendanceRepository.save(attendance);
        return attendance;
    }


    public Attendance getAttendanceById(Integer id) {
        return attendanceRepository.findById(id).isEmpty() ?
                null : attendanceRepository.findById(id).get();
    }

    public Attendance updateAttendance(Integer id, Attendance attendance) {
        if (attendance.getId() == id && attendanceRepository.existsById(attendance.getId())) {
            attendanceRepository.findById(id).get().setEmployee(attendance.getEmployee());
            attendanceRepository.findById(id).get().setCheckInHour(attendance.getCheckInHour());
            attendanceRepository.findById(id).get().setCheckOutHour(attendance.getCheckOutHour());
            attendanceRepository.findById(id).get().setDate(attendance.getDate());
            return attendance;
        }
        return null;
    }

    public List<Attendance> deleteAttendance(Integer id) {
        attendanceRepository.deleteById(id);
        return attendanceRepository.findAll();
    }

    private String getTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return (sdf.format(cal.getTime()));
    }

    private String getDate() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date now = new Date();
        return df.format(now);
    }

    public Attendance checkIn(Employee employee) {
        if (!employeeService.isEmployee(employee.getId()))
            return null;
        Attendance newAttendance = new Attendance();
        newAttendance.setEmployee(employee);
        newAttendance.setDate(getDate());
        newAttendance.setCheckInHour(getTime());
        attendanceRepository.save(newAttendance);
        return newAttendance;
    }

//    public Attendance checkOut(Employee employee) {
//        return null;
//    }
}

