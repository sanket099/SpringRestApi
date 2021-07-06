package com.sanket.Spring.Rest.Api.repos;

import com.sanket.Spring.Rest.Api.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> { // gives number of functions, provided during runtime
}
