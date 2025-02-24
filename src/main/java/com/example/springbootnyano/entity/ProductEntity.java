package com.example.springbootnyano.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Data
@Entity
@Table(name = "java_product_001")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private BigDecimal productPrice;

   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(
           name = "java_product_order_001",
           joinColumns = @JoinColumn(name="product_id"),
           inverseJoinColumns = @JoinColumn(name="order_id")
   )
    private List<OrderEntity> orderList;
}
