package com.mongodb.example.spring_mongodb.repository;

import com.mongodb.example.spring_mongodb.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {
    //System.out.println("--------------------------------");
}
