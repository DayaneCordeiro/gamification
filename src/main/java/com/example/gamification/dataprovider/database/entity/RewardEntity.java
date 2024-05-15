package com.example.gamification.dataprovider.database.entity;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document(collection = "rewards")
public record RewardEntity(
    @Id
    String id,
    String name,
    Integer value
) {
}
