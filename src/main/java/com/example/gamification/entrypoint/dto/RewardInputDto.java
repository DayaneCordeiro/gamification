package com.example.gamification.entrypoint.dto;

import lombok.Builder;

@Builder
public record RewardInputDto(
    String name,
    int value
) {
}
