package com.myprojects.orderservice.domain;

import com.myprojects.orderservice.model.Order;

import java.util.List;

public class OrderDomain {
    private String status;
    private List<Order> orderList;

    public String getStatus() {
        return status;
    }

    public OrderDomain() {

    }

    public OrderDomain(String status, List<Order> orderList) {
        this.status = status;
        this.orderList = orderList;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
