package com.example.springbootnyano.service.impl;

import com.example.springbootnyano.entity.ProductEntity;
import com.example.springbootnyano.repository.ProductRepository;
import com.example.springbootnyano.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceimpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public ProductEntity createProduct(ProductEntity product) {
        return productRepository.createProduct(product);
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        return productRepository.findAllProducts();
    }
}
