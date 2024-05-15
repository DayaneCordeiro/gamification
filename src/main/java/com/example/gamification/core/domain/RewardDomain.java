package com.example.gamification.core.domain;

import lombok.Builder;

@Builder
public record RewardDomain(

    String id,
    String name,
    Integer value
) {
}
