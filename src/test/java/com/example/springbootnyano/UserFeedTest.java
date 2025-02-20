package com.example.springbootnyano;

import com.example.springbootnyano.entity.user.CCCDEntity;
import com.example.springbootnyano.entity.user.UserEntity;
import com.example.springbootnyano.repository.CCCDRepository;
import com.example.springbootnyano.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
public class UserFeedTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CCCDRepository cccdRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    void oneToOneTest(){
        UserEntity user = new UserEntity();
        CCCDEntity cccdEntity = new CCCDEntity();

        user.setUserName("Test");
        user.setUserEmail("test@gmail.com");

        cccdEntity.setNumberCCCD("11111111111");

        user.setCccd(cccdEntity);
        userRepository.save(user);
    }
}
