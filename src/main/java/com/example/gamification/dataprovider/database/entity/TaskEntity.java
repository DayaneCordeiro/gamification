package com.example.gamification.dataprovider.database.entity;

import com.example.gamification.core.enumeration.TaskStatus;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Builder
@Document(collection = "tasks")
public record TaskEntity(
    @Id
    String id,
    String name,
    LocalDate initialDate,
    LocalDate finalDate,
    Integer recurrence,
    Integer weight,
    String userId,
    TaskStatus status
) {
}
