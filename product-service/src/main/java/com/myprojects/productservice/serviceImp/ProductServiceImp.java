package com.myprojects.productservice.serviceImp;

import com.myprojects.productservice.model.ProductEntity;
import com.myprojects.productservice.repository.ProductRepository;
import com.myprojects.productservice.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductEntity> findAllById(Long id) {
        return productRepository.findById(id);
    }
}
