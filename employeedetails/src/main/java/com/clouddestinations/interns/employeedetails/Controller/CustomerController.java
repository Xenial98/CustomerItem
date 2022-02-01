package com.clouddestinations.interns.employeedetails.Controller;

import com.clouddestinations.interns.employeedetails.Entity.Customer;
import com.clouddestinations.interns.employeedetails.Entity.Item;
import com.clouddestinations.interns.employeedetails.Service.CustomerService;
import com.clouddestinations.interns.employeedetails.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ItemService itemService;

//------------------------------------------------------------------------------------------------------------------

    // Customer functions & operations

    @RequestMapping(method = RequestMethod.GET, value = "/customerdetail")
    public List<Customer> getCustomerDetails() {

        return customerService.getCustomersDetails();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customerdetail")
    public void AddCustomerDetail(@RequestBody Customer customer)   {

        customerService.AddCustomerDetail(customer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/customerdetail/update/{id}")
    public void updateCustomerDetail(@RequestBody Customer customer, Integer id)    {

        customerService.updateCustomerDetail(customer, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/customerdetail/delete/{id}")
    public void removeSpecificCustomerDetail(@PathVariable("id") Integer id)    {

        customerService.removeSpecificCustomerDetail(id);
    }

//-----------------------------------------------------------------------------------------------------------------

    // Item functions & operations

    @RequestMapping(method = RequestMethod.GET, value = "/itemdetail")
    public List<Item> getItemDetails()  {

        return itemService.getItemDetails();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/itemdetail")
    public void AddItemDetail(@RequestBody Item item)   {

        itemService.AddItemDetail(item);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/itemdetail/update/{id}")
    public void updateIteDetail(@RequestBody Item item, Integer id )   {

        itemService.updateItemDetail(item, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/itemdetail/delete/id")
    public void removeSpecificItemDetail(@PathVariable("id") Integer id)    {

        itemService.removeSpecificItemDetail(id);
    }

//----------------------------------------------------------------------------------------------------------------

// CustomerItem class functions & operations



}
