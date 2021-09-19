package com.myprojects.productservice.controller;

import com.myprojects.productservice.domain.ProductDomain;
import com.myprojects.productservice.model.Product;
import com.myprojects.productservice.model.ProductEntity;
import com.myprojects.productservice.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    @CrossOrigin
    public ProductDomain getAllProduct() throws RuntimeException {
        System.out.println("Hits : "+System.currentTimeMillis());
        List<ProductEntity> productList = productService.getAllProducts();
        ProductDomain productDomain = new ProductDomain();
        productDomain.setStatus("Success Message From Eureka");
        productDomain.setProductList(productList);
        return productDomain;
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) throws RuntimeException {
        System.out.println("Hits : "+System.currentTimeMillis());
        ResponseEntity<?> productList = ResponseEntity.ok(productService.findAllById(id)
                .map(ResponseEntity::ok)
                .orElseGet(ResponseEntity.noContent()::build));
        return productList;
//        throw new RuntimeException("BAM !  " +System.currentTimeMillis());
    }
}
