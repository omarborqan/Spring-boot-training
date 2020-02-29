package com.hotel.attendance;

import com.hotel.employee.Employee;

import javax.persistence.*;

@Entity
public class Attendance {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private String checkInHour;

    private String checkOutHour;

    private String date;

    protected Attendance() {

    }

    public Attendance(Integer id) {
        this.employee = employee;
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCheckInHour() {
        return checkInHour;
    }

    public void setCheckInHour(String checkInHour) {
        this.checkInHour = checkInHour;
    }

    public String getCheckOutHour() {
        return checkOutHour;
    }

    public void setCheckOutHour(String checkOutHour) {
        this.checkOutHour = checkOutHour;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}

