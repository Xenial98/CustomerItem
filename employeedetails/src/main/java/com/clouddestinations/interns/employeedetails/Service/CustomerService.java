package com.clouddestinations.interns.employeedetails.Service;

import com.clouddestinations.interns.employeedetails.Entity.Customer;
import com.clouddestinations.interns.employeedetails.Repository.CustomerRepository;
import com.clouddestinations.interns.employeedetails.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ItemRepository itemRepository;
//---------------------------------------------------------------------------------------------------------------------

// customer class method

    public List<Customer> getCustomersDetails()    {

        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;

    }

    public void AddCustomerDetail(Customer customer)    {

        customerRepository.save(customer);
    }

    public void updateCustomerDetail(Customer customer, Integer id)    {
        
        customerRepository.save(customer);
    }

    public void removeSpecificCustomerDetail(Integer id)    {

        customerRepository.deleteById(id);
    }
//---------------------------------------------------------------------------------------------------------------------

// CustomerItem class method


}
