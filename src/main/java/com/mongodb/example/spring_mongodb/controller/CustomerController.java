package com.mongodb.example.spring_mongodb.controller;

import com.mongodb.example.spring_mongodb.model.Customer;
import com.mongodb.example.spring_mongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        System.out.println("--------------------------------");
        return "Customer Saved Successfully";
    }

    @GetMapping("/findCustomer/{customerId}")
    public Customer findCustomerById(@PathVariable("customerId") int id){
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        System.out.println("**************************************************");
        return optionalCustomer.get();
    }
// add dummy codes
    @GetMapping("/findAllCustomer")
    public List<Customer> findAllCustomer(){
        List<Customer> customerList = customerRepository.findAll();
        return customerList;
    }
// add dummy codes
// add dummy codes
// add dummy codes
    @DeleteMapping("/deleteCustomer/{customerId}")
    public String deleteCustomer(@PathVariable("customerId") int id){
        customerRepository.deleteById(id);
        System.out.println("--------------------------------");
        return "Customer with id "+id+" got deleted successfully";
    }
	// add dummy codes
}
