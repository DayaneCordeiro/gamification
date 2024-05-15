package com.example.gamification.core.usecase.imp;

import com.example.gamification.core.domain.RewardDomain;
import com.example.gamification.core.gateway.RewardGateway;
import com.example.gamification.core.usecase.CreateRewardUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateRewardUseCaseImp implements CreateRewardUseCase {

    private final RewardGateway gateway;

    @Override
    public void create(RewardDomain rewardDomain) {
        gateway.create(rewardDomain);
    }
}
