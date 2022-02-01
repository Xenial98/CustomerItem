package com.clouddestinations.interns.employeedetails.Service;

import com.clouddestinations.interns.employeedetails.Entity.Item;
import com.clouddestinations.interns.employeedetails.Repository.CustomerRepository;
import com.clouddestinations.interns.employeedetails.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ItemRepository itemRepository;

//----------------------------------------------------------------------------------------------------------------------

// Item class method

    public List<Item> getItemDetails() {

        List<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(items::add);
        return items;
    }

    public void AddItemDetail(Item item)    {

        itemRepository.save(item);
    }

    public void updateItemDetail(Item item, Integer id) {

        itemRepository.save(item);
    }

    public void removeSpecificItemDetail(Integer id)    {

        itemRepository.deleteById(id);
    }

//----------------------------------------------------------------------------------------------------------------------

// CustomerItem class method


}
