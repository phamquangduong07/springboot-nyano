package com.example.springbootnyano.repository.impl;

import com.example.springbootnyano.entity.ProductEntity;
import com.example.springbootnyano.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class ProductRepositoryimpl implements ProductRepository{
    @Override
    public ProductEntity createProduct(ProductEntity product) {
        ProductEntity productEntity= new ProductEntity();
        Long id = 1L;
        productEntity.setId(id);
        productEntity.setProductName("TipsJava");
        productEntity.setProductPrice(new BigDecimal("21.6"));
        return null;
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        ProductEntity productEntity= new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("TipsJava");
        productEntity.setProductPrice(new BigDecimal("21.6"));
        return List.of(productEntity);
    }
}
