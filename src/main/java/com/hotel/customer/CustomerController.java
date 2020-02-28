package com.hotel.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public ResponseEntity getCustomers() {
        return ResponseEntity.ok(customerService.getCustomers());
    }

    @PostMapping()
    public ResponseEntity addCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.addCustomer(customer));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getCustomerById(@PathVariable Integer id) {
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity updateCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.updateCustomer(id, customer));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteCustomer(@PathVariable Integer id) {
        return ResponseEntity.ok(customerService.deleteCustomer(id));
    }

}
