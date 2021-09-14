package com.myprojects.productservice.service;

import com.myprojects.productservice.model.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    public List<ProductEntity> getAllProducts();
}
