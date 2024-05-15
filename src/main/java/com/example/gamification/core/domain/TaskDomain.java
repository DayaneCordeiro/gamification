package com.example.gamification.core.domain;

import com.example.gamification.core.enumeration.TaskStatus;

import java.time.LocalDate;

public record TaskDomain(

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
