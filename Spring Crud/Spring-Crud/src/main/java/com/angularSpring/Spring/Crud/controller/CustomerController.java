package com.angularSpring.Spring.Crud.controller;


import com.angularSpring.Spring.Crud.entity.Customer;
import com.angularSpring.Spring.Crud.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    private final CustomerService customerService;
    @PostMapping("/customer")
    public Customer postCustomer(@RequestBody Customer customer){
        return customerService.postCustomer(customer);
    }

    @GetMapping("/getcustomers")
    private List<Customer> getAllCustomers(){
        return customerService.getAllCustomer();
    }
}
