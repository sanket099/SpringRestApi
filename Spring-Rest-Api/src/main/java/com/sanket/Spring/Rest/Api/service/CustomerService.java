package com.sanket.Spring.Rest.Api.service;

import com.sanket.Spring.Rest.Api.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();
    Customer saveCustomer(Customer customer);
}
