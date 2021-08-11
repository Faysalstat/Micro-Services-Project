package com.myprojects.orderservice.domain;



import com.myprojects.orderservice.model.Product;

import java.util.List;

public class ProductDomain {
    private String status;
    private List<Product> productList;

    public ProductDomain() {

    }

    public ProductDomain(String status, List<Product> productList) {
        this.status = status;
        this.productList = productList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
