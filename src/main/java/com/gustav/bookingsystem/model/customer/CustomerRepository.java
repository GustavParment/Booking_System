package com.gustav.bookingsystem.model.customer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository
        extends MongoRepository<Customer,String> {
    Customer findByEmail(String email);

}
