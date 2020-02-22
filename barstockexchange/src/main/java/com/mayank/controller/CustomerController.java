package com.mayank.controller;

import com.mayank.model.Customer;
import com.mayank.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

// rest is a way of creating API's. Rest API's uses Crud functionality.
// Crud stands for create, read, update, delete

@RestController(value = "CustomerController")
@RequestMapping("/customer")
public class CustomerController {

    @Resource(name = "CustomerService")
    private CustomerService customerService;

    @GetMapping("/viewall")
    public List<Customer> getAll()
    {
       return customerService.getAllCustomers();
    }

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable("id") Long id)
    {
        customerService.deleteCustomer(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Customer> findCustomerById(@PathVariable("id") Long id)
    {
        return customerService.findCustomerById(id);
    }
}
