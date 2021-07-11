package com.myprojects.productservice.domain;

import com.myprojects.productservice.model.Product;

import java.util.List;

public class ProductDomain {
    private String status;
    private List<Product> productList;

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
