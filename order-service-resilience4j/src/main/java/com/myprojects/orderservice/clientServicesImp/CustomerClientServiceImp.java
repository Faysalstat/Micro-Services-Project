package com.myprojects.orderservice.clientServicesImp;

import com.myprojects.orderservice.clientServices.CustomerClientService;
import com.myprojects.orderservice.domain.CustomerDomain;
import com.myprojects.orderservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerClientServiceImp implements CustomerClientService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public CustomerDomain getCustomers(@PathVariable long userId) {
        return restTemplate.getForObject("http://CUSTOMER-SERVICE/customer/1", CustomerDomain.class);
    }
    @Override
    public CustomerDomain getCustomerFallback(@PathVariable long userId) {
        List<Customer> customerList = new ArrayList();
        customerList.add(new Customer());
        return new CustomerDomain("Customer Not Found", customerList);
    }

}
