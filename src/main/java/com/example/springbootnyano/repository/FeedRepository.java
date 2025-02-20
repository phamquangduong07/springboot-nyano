package com.example.springbootnyano.repository;

import com.example.springbootnyano.entity.feed.FeedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedRepository extends JpaRepository<FeedEntity,Long> {
}
