package com.example.gamification.entrypoint.dto;

import com.example.gamification.core.enumeration.TaskStatus;
import jakarta.annotation.Nullable;

import java.time.LocalDate;

public record TaskOutputDto(
    String id,
    String name,
    LocalDate initialDate,
    @Nullable
    LocalDate finalDate,
    int recurrence,
    int weight,
    String userId,
    TaskStatus status
) {
}
