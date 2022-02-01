package com.clouddestinations.interns.employeedetails.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customerdetail")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "customer_id", unique = true)
    private int customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_city")
    private String customerCity;

//    @Transient
//    private Item item;


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }
}
