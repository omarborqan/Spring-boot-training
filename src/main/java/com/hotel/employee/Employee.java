package com.hotel.employee;

import com.hotel.attendance.Attendance;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    private Integer id;

    @Enumerated(EnumType.STRING)
    private EmployeeRole role;

    @OneToMany(mappedBy = "employee")
    private List<Attendance> attendances;


    protected Employee() {

    }

    public Employee(Integer id, EmployeeRole role) {
        this.id = id;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Attendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<Attendance> attendances) {
        this.attendances = attendances;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }


}
