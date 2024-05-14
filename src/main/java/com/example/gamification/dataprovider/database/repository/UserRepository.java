package com.example.gamification.dataprovider.database.repository;

import com.example.gamification.dataprovider.database.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String>  {
}
