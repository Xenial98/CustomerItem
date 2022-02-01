package com.clouddestinations.interns.employeedetails.Service;

import com.clouddestinations.interns.employeedetails.CustomerItem;
import com.clouddestinations.interns.employeedetails.Entity.Customer;
import com.clouddestinations.interns.employeedetails.Entity.Item;
import com.clouddestinations.interns.employeedetails.Repository.CustomerRepository;
import com.clouddestinations.interns.employeedetails.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BillingService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ItemRepository itemRepository;

//---------------------------------------------------------------------------------------------------------------------

// CustomerItem functions

    public CustomerItem addCustomerItemDetail(CustomerItem customerItem)     {

       // List<Customer> customerItemList = new ArrayList<>();
        Customer customer = customerRepository.save(customerItem.getCustomer());
        List<Item> items = new ArrayList<>();
        for (Item items: item) {
            items.setCustomerId();

        }

    }

}
