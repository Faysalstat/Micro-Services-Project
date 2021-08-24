package com.myprojects.orderservice.clientServices;

import com.myprojects.orderservice.domain.ProductDomain;
import org.springframework.web.bind.annotation.PathVariable;


public interface ProductClientService {

    public ProductDomain getProducts(@PathVariable long userId);

    public ProductDomain getProductFallback(@PathVariable long userId);
}
