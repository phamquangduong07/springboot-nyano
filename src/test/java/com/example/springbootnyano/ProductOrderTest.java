package com.example.springbootnyano;


import com.example.springbootnyano.entity.OrderEntity;
import com.example.springbootnyano.entity.ProductEntity;
import com.example.springbootnyano.repository.OrderRepository;
import com.example.springbootnyano.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class ProductOrderTest {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    void manyToManyInsertTest(){
        ProductEntity product1 = new ProductEntity();
        ProductEntity product2 = new ProductEntity();
        OrderEntity order1 = new OrderEntity();
        OrderEntity order2 = new OrderEntity();
        OrderEntity order3 = new OrderEntity();

        product1.setProductName("p 1");
        product1.setProductPrice(new BigDecimal("4.6"));

        product2.setProductName("p 2");
        product2.setProductPrice(new BigDecimal("4.7"));

        order1.setUserID(1);
        order2.setUserID(2);

        product1.setOrderList(List.of(order1,order2));
        product2.setOrderList(List.of(order1,order3,order2));

        orderRepository.save(order1);
        orderRepository.save(order2);
        orderRepository.save(order3);

        productRepository.save(product1);
        productRepository.save(product2);

    }
    @Test
    @Transactional
    void selectManyToManyTest(){
        ProductEntity p1  =productRepository.findById(1L).orElseThrow();
        System.out.println(p1);
        System.out.println(p1.getOrderList());
    }
}
