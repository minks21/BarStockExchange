package com.mayank.service;

import com.mayank.model.Customer;
import com.mayank.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

// bean creation - ek object hota hai jiska instance banta hai jab bhi woh call ho

@Service(value = "CustomerService")
public class CustomerService {

    @Resource(name = "CustomerRepository")
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers()
    {
        return customerRepository.findAll();
    }

    public Customer addCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id)
    {
        customerRepository.deleteById(id);
    }

    public Optional<Customer> findCustomerById(Long id)
    {
        return customerRepository.findById(id);
    }

}
