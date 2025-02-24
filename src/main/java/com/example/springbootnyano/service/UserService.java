package com.example.springbootnyano.service;

import com.example.springbootnyano.entity.user.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
 UserEntity createUser(UserEntity user);

 List<UserEntity> getAllUsers();


 UserEntity findByUserNameAndUserEmail(String userName,String userEmai);

 //get all by limit offset
 Page<UserEntity> findAllUsers(Pageable pageable);
 //get search by limit offset
 Page<UserEntity> findByUserName(String userName,Pageable pageable);
}
