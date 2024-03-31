package com.angularSpring.Spring.Crud.service;


import com.angularSpring.Spring.Crud.entity.Customer;
import com.angularSpring.Spring.Crud.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;
    public Customer postCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
