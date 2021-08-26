package com.myprojects.orderservice.clientServicesImp;

import com.myprojects.orderservice.clientServices.ProductClientService;
import com.myprojects.orderservice.domain.ProductDomain;
import com.myprojects.orderservice.model.Product;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    public ProductDomain getProducts(long userId) {
        System.out.println("Service Called");
        return restTemplate.getForObject("http://PRODUCT-SERVICE/product/1", ProductDomain.class);
    }

    @Override
    public ProductDomain getProductFallback(long userId,Throwable ex) {
        List<Product> productList = new ArrayList();
        productList.add(new Product());
        return new ProductDomain("Product "+userId+" Not Found",productList);
    }
}
