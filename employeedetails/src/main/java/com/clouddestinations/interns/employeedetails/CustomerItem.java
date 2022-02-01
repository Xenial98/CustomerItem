package com.clouddestinations.interns.employeedetails;

import com.clouddestinations.interns.employeedetails.Entity.Customer;
import com.clouddestinations.interns.employeedetails.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerItem {

    private Customer customer;

    private List<Item> items;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
