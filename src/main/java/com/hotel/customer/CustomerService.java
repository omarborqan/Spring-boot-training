package com.hotel.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer addCustomer(Customer customer) {
        if (customerRepository.existsById(customer.getId())) {
            return null;
        }
        customerRepository.save(customer);
        return customerRepository.findById(customer.getId()).get();
    }


    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id).isEmpty() ?
                null : customerRepository.findById(id).get();
    }

    public Customer updateCustomer(Integer id, Customer customer) {
        if (customer.getId() == id && customerRepository.existsById(customer.getId())) {
            customerRepository.findById(id).get().setName(customer.getName());
            return customer;
        }
        return null;
    }

    public List<Customer> deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
        return customerRepository.findAll();
    }

    public boolean customerExist(Integer id) {
        return customerRepository.existsById(id);
    }
}
