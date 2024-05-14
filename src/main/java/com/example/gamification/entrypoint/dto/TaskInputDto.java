package com.example.gamification.entrypoint.dto;

import com.example.gamification.core.enumeration.TaskStatus;
import jakarta.annotation.Nullable;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record TaskInputDto(
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
