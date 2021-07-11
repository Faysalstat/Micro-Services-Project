package com.myprojects.orderservice.controller;

import com.myprojects.orderservice.domain.CustomerDomain;
import com.myprojects.orderservice.domain.OrderDomain;
import com.myprojects.orderservice.domain.ProductDomain;
import com.myprojects.orderservice.model.Customer;
import com.myprojects.orderservice.model.Order;
import com.myprojects.orderservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderRequestController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/{userId}")
    public OrderDomain getOrders(@PathVariable long userId) {
        OrderDomain orderDomain = new OrderDomain();
        List<Order> orderList = new ArrayList();
        CustomerDomain customers = restTemplate.getForObject("http://CUSTOMER-SERVICE/customer/1", CustomerDomain.class);
        ProductDomain products = restTemplate.getForObject("http://PRODUCT-SERVICE/product/1", ProductDomain.class);
        orderList.add(new Order(1, customers.getCustomerList().get(0), products.getProductList().get(0), 5));
        orderDomain.setStatus("Success Message From Discovery Service");
        orderDomain.setOrderList(orderList);
        return orderDomain;
    }


//Using webclient for test
//    @GetMapping("/{userId}")
//    public List<Order> getOrders(@PathVariable long userId) {
//
//        List<Order> orderList = new ArrayList();
//        CustomerDomain customerDomain = webClientBuilder.build()
//                .get()
//                .uri("http://localhost:8082/customer/1")
//                .retrieve()
//                .bodyToMono(CustomerDomain.class).block();
//        ProductDomain productDomain = webClientBuilder.build()
//                .get()
//                .uri("http://localhost:8083/product/1")
//                .retrieve()
//                .bodyToMono(ProductDomain.class).block();
//        orderList.add(new Order(1, customerDomain.getCustomerList().get(0), productDomain.getProductList().get(0), 5));
//        return orderList;
//    }
}
