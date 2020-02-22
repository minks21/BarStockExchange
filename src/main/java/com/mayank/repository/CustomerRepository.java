package com.mayank.repository;

import com.mayank.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// jpa repository take two parameters - 1. model class, 2. data type of primary key
@Repository(value = "CustomerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
