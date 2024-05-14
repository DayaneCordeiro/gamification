package com.example.gamification.core.domain;

import lombok.Builder;

@Builder
public record UserDomain(

    String id,
    String name,
    Integer points
) {
}
