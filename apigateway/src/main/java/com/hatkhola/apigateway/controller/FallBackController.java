package com.hatkhola.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fallback")
public class FallBackController {

    @GetMapping("/order")
    public String getOrderFallbackMessage(){
        return "Order Service is Down!";
    }
}
