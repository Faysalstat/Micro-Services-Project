package com.myprojects.orderservice.clientServicesImp;

import com.myprojects.orderservice.clientServices.ProductClientService;
import com.myprojects.orderservice.domain.ProductDomain;
import com.myprojects.orderservice.model.Product;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductClientServiceImp implements ProductClientService {
    @Autowired
    private RestTemplate restTemplate;

    private static final String BACKEND_A = "productBackend";

    @Override
    @CircuitBreaker(name = BACKEND_A,fallbackMethod = "getProductFallback")
    @Bulkhead(name = BACKEND_A)
    @Retry(name = BACKEND_A)
    public ProductDomain getProducts(@PathVariable long userId) {
        return restTemplate.getForObject("http://PRODUCT-SERVICE/product/1", ProductDomain.class);
    }

    @Override
    public ProductDomain getProductFallback(@PathVariable long userId) {
        List<Product> productList = new ArrayList();
        productList.add(new Product());
        return new ProductDomain("Product Not Found",productList);
    }
}
