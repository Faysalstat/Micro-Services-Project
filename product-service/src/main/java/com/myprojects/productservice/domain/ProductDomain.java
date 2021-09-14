package com.myprojects.productservice.domain;

import com.myprojects.productservice.model.Product;
import com.myprojects.productservice.model.ProductEntity;

import java.util.List;

public class ProductDomain {
    private String status;
    private List<ProductEntity> productList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ProductEntity> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductEntity> productList) {
        this.productList = productList;
    }
}
