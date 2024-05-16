package com.example.gamification.core.usecase.imp;

import com.example.gamification.core.domain.UserDomain;
import com.example.gamification.core.gateway.UserGateway;
import com.example.gamification.core.usecase.UpdateUserPointsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateUserPointsUseCaseImp implements UpdateUserPointsUseCase {

    private final UserGateway userGateway;

    @Override
    public void updatePoints(String id, Integer points) {
        UserDomain currentUser = userGateway.get(id);

        currentUser.setPoints(currentUser.getPoints() + points);

        userGateway.save(currentUser);
    }
}
