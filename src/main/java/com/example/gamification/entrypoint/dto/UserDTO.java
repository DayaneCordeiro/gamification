package com.example.gamification.entrypoint.dto;

import lombok.Builder;

@Builder
public record UserDTO(
    String name,
    int points
) {
}
