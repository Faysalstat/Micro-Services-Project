package com.myprojects.productservice.repository;

import com.myprojects.productservice.model.Product;
import com.myprojects.productservice.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    public List<ProductEntity> findAll();
}
