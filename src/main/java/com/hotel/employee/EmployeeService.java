package com.hotel.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        if (employeeRepository.existsById(employee.getId())) {
            return null;
        }
        employeeRepository.save(employee);
        return employeeRepository.findById(employee.getId()).get();
    }


    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).isEmpty() ?
                null : employeeRepository.findById(id).get();
    }

    public Employee updateEmployee(Integer id, Employee employee) {
        if (employee.getId() == id && employeeRepository.existsById(employee.getId())) {
            employeeRepository.findById(id).get().setRole(employee.getRole());
            employeeRepository.findById(id).get().setAttendances(employee.getAttendances());
            return employee;
        }
        return null;
    }

    public List<Employee> deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
        return employeeRepository.findAll();
    }

    public boolean isEmployee(Integer id) {
        return employeeRepository.existsById(id);
    }
}
