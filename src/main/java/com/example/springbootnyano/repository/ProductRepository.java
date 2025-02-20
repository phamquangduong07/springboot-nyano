package com.example.springbootnyano.repository;

import com.example.springbootnyano.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface  ProductRepository {

    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findAllProducts();
}
