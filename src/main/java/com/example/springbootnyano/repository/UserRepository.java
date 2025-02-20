package com.example.springbootnyano.repository;

import com.example.springbootnyano.entity.user.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@RepositoryDefinition(domainClass = UserEntity.class,idClass = Long.class)

public interface UserRepository extends JpaRepository<UserEntity,Long>
        , JpaSpecificationExecutor<UserEntity> {
    //Use pageable
    Page<UserEntity> findByUserNameContains(String name, Pageable pageable);
    //find username vs userEmail

    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    UserEntity findByUserName(String userName);

    //where userName LIKE %?
    List<UserEntity> findByUserNameStartingWith(String userEmail);

    //where userName LIKE ?%
    List<UserEntity> findByUserNameEndingWith(String userEmail);

    //where id < 1

    List<UserEntity> findByIdLessThan(Long id);

    //RAW JPQL
    @Query("SELECT u FROM UserEntity u WHERE u.id = (SELECT MAX(p.id) FROM UserEntity p)")
    UserEntity findMaxIdUser();

    @Query("SELECT u FROM UserEntity u WHERE u.userName=?1 AND u.userName=?2")
    List<UserEntity> getUserEntityBy(String userName, String userEmail);

    @Query("SELECT u FROM UserEntity u WHERE u.userName=:userName AND u.userName=:userEmail")
    List<UserEntity> getUserEntityByTwo(@Param("userName") String userName,@Param("userEmail") String userEmail);

    //UPDATE DELETE
    @Modifying
    @Query("UPDATE UserEntity u SET u.userName =:userName")
    @Transactional
    int updateUserName(@Param("userName") String userName);

    //Native query: get count user native query

    @Query(value = "SELECT COUNT(id) FROM java_user_001",nativeQuery = true)
    long getTotalUser();
}
