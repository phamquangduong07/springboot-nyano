package com.example.springbootnyano.entity.user;

import com.example.springbootnyano.entity.feed.FeedEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;

@Data
@Entity
@Table(name = "java_user_001")
@DynamicInsert
@DynamicUpdate

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(255) COMMENT 'user name'",nullable = false)
    private  String userName;

    @Column(columnDefinition = "VARCHAR(255) COMMENT 'user email'",nullable = false,unique = true)
    private String userEmail;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<FeedEntity> feedList;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cccd_id")
    private CCCDEntity cccd;
}
