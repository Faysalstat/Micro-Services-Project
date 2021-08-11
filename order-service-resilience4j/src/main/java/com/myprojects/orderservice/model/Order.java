package com.myprojects.orderservice.model;

import com.myprojects.orderservice.domain.CustomerDomain;
import com.myprojects.orderservice.domain.ProductDomain;

public class Order {
    private long id;
    private CustomerDomain customer;
    private ProductDomain product;
    private int quantity;

    public Order(long id, CustomerDomain customer, ProductDomain product,int quantity) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CustomerDomain getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDomain customer) {
        this.customer = customer;
    }

    public ProductDomain getProduct() {
        return product;
    }

    public void setProduct(ProductDomain product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
