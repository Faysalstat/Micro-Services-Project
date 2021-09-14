package com.myprojects.productservice.controller;

import com.myprojects.productservice.domain.ProductDomain;
import com.myprojects.productservice.model.Product;
import com.myprojects.productservice.model.ProductEntity;
import com.myprojects.productservice.service.ProductService;
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
//    @GetMapping("/{productId}")
//    public ProductDomain getProductById(@PathVariable long productId) throws RuntimeException {
//        System.out.println("Hits : "+System.currentTimeMillis());
//        List<Product> productList = new ArrayList();
//        ProductDomain productDomain = new ProductDomain();
//        productList.add(new Product(1, "Coca Cola", 200.00));
//        productDomain.setStatus("Success Message From Eureka");
//        productDomain.setProductList(productList);
//        return productDomain;
////        throw new RuntimeException("BAM !  " +System.currentTimeMillis());
//    }
}
