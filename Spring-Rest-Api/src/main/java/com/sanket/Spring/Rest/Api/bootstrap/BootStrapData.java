package com.sanket.Spring.Rest.Api.bootstrap;

import com.sanket.Spring.Rest.Api.model.Customer;
import com.sanket.Spring.Rest.Api.repos.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepo customerRepo;

    public BootStrapData(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    @Override
    public void run(String... args) throws Exception { // run on startup

        Customer c1 = new Customer();
        c1.setFirstName("Hello");
        c1.setLastName("bye");
        customerRepo.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Hello c2");
        c2.setLastName("bye c2");
        customerRepo.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Hello c3");
        c3.setLastName("bye c3");
        customerRepo.save(c3);
    }
}
