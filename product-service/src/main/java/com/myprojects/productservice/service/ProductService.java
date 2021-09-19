package com.myprojects.productservice.service;

import com.myprojects.productservice.model.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    List<ProductEntity> getAllProducts();
    Optional<ProductEntity> findAllById(Long id);
}
