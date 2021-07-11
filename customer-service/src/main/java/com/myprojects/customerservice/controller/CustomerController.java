package com.myprojects.customerservice.controller;

import com.myprojects.customerservice.domain.CustomerDomain;
import com.myprojects.customerservice.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/{customerId}")
    public CustomerDomain getCustomer(@PathVariable long customerId) {
        List<Customer> customerList = new ArrayList();
        Customer customer = new Customer(1, "Fasal Ahmad", "faysal@gmail.com");
        customerList.add(customer);
        CustomerDomain customerDomain = new CustomerDomain();
        customerDomain.setStatus("success");
        customerDomain.setCustomerList(customerList);
        return customerDomain;
    }
}
