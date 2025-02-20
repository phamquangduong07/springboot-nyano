package com.example.springbootnyano.entity.feed;

import com.example.springbootnyano.entity.user.UserEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@Table(name = "java_feed_001")
@DynamicInsert
@DynamicUpdate
public class FeedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedId",nullable = false)
    private Long id;

    @Column(nullable = false,length = 255)
    private String title;

    @Lob
    @Column(nullable = true)
    private String description;

    @ManyToOne(cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name = "userId",nullable = false)
    private UserEntity user;
}
