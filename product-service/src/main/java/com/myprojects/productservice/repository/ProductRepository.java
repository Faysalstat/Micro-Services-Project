package com.myprojects.productservice.repository;

import com.myprojects.productservice.model.Product;
import com.myprojects.productservice.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findAll();
    Optional<ProductEntity> findById(Long id);

}
