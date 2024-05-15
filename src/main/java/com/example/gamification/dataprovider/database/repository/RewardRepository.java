package com.example.gamification.dataprovider.database.repository;

import com.example.gamification.dataprovider.database.entity.RewardEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardRepository extends MongoRepository<RewardEntity, String> {
}
