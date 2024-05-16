package com.example.gamification.core.usecase;

import com.example.gamification.core.domain.UserDomain;

public interface UpdateUserPointsUseCase {

    public void updatePoints(String id, Integer points);
}
