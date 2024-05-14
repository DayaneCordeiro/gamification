package com.example.gamification.dataprovider.database.entity;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document(collection = "users")
public record UserEntity(
    @Id
    String id,
    String name,
    Integer points
) {
}
