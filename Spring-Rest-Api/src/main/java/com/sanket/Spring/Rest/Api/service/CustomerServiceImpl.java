package com.sanket.Spring.Rest.Api.service;

import com.sanket.Spring.Rest.Api.model.Customer;
import com.sanket.Spring.Rest.Api.repos.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService { //just working with repos //for business logic

    private final CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    @Override
    public Customer findCustomerById(Long id) {
        return customerRepo.getById(id);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }
}
