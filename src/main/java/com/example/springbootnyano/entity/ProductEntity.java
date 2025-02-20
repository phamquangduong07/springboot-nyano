package com.example.springbootnyano.entity;

import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;


@Data
@Table(name = "java_product_001")
public class ProductEntity {
    private Long id;

    private String productName;

    private BigDecimal productPrice;

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }
}
