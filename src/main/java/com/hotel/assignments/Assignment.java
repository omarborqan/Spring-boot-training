//package com.example.demo.assignments;
//
//import com.example.demo.employee.Employee;
//import com.example.demo.room.Room;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Assignment {
//    @Id
//    @GeneratedValue
//    private Integer id;
//
//    @ManyToOne
//    private Employee manager;
//
//    @ManyToOne
//    private Employee employee;
//
//    @ManyToOne
//    private Room room;
//
//    protected Assignment() {
//
//    }
//
//    public Assignment(Employee manager, Employee employee, Room room) {
//        this.manager = manager;
//        this.employee = employee;
//        this.room = room;
//    }
//
//    public Employee getManager() {
//        return manager;
//    }
//
//    public void setManager(Employee manager) {
//        this.manager = manager;
//    }
//
//    public Room getRoom() {
//        return room;
//    }
//
//    public void setRoom(Room room) {
//        this.room = room;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//}
