package com.myprojects.productservice.controller;

import com.myprojects.productservice.domain.ProductDomain;
import com.myprojects.productservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/{productId}")
    public ProductDomain getProduct(@PathVariable long productId) {
        List<Product> productList = new ArrayList();
        ProductDomain productDomain = new ProductDomain();
        productList.add(new Product(1, "Coca Cola", 200.00));
        productDomain.setStatus("Success Message From Eureka");
        productDomain.setProductList(productList);
        return productDomain;
    }
}
