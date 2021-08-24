package com.myprojects.orderservice.clientServices;

import com.myprojects.orderservice.domain.CustomerDomain;
import org.springframework.web.bind.annotation.PathVariable;


public interface CustomerClientService {

    public CustomerDomain getCustomers(@PathVariable long userId);

    public CustomerDomain getCustomerFallback(@PathVariable long userId);
}
