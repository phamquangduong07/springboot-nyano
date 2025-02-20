package com.example.springbootnyano;


import com.example.springbootnyano.entity.feed.FeedEntity;
import com.example.springbootnyano.entity.user.UserEntity;
import com.example.springbootnyano.repository.FeedRepository;
import com.example.springbootnyano.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
public class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FeedRepository feedRepository;



    @Test
    @Transactional
    @Rollback(value = false)
    void oneToManyTest(){
        UserEntity user = new UserEntity();
        FeedEntity feed = new FeedEntity();

        user.setUserName("Tips Go");
        user.setUserEmail("go@gmail.com");

        feed.setTitle("feed 002");
        user.setFeedList(List.of(feed));
        feed.setUser(user);


        userRepository.save(user);

    }

    @Test
    @Transactional
    void selectOneToManyTest(){
        UserEntity user = userRepository.findById(3L).orElseThrow();
        System.out.println(user);
        System.out.println(user.getFeedList());
    }

}
