package com.clouddestinations.interns.employeedetails.Controller;

import com.clouddestinations.interns.employeedetails.CustomerItem;
import com.clouddestinations.interns.employeedetails.Entity.Customer;
import com.clouddestinations.interns.employeedetails.Entity.Item;
import com.clouddestinations.interns.employeedetails.Service.BillingService;
import com.clouddestinations.interns.employeedetails.Service.CustomerService;
import com.clouddestinations.interns.employeedetails.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class BillingController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private BillingService billingService;

    @RequestMapping(method = RequestMethod.POST, value = "/customerdetail/add")
    public CustomerItem addCustomerItemDetail(CustomerItem customerItem)    {
        return billingService.addCustomerItemDetail(customerItem);
    }
}
