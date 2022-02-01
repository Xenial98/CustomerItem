package com.clouddestinations.interns.employeedetails.Repository;

import com.clouddestinations.interns.employeedetails.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByCustomerId(Integer id);
}
