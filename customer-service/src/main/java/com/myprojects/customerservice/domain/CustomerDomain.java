package com.myprojects.customerservice.domain;

import com.myprojects.customerservice.model.Customer;

import java.util.List;

public class CustomerDomain {
    private String status;
    private List<Customer> customerList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
