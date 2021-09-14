package com.myprojects.productservice.serviceImp;

import com.myprojects.productservice.model.ProductEntity;
import com.myprojects.productservice.repository.ProductRepository;
import com.myprojects.productservice.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
