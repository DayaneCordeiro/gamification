package com.example.gamification.dataprovider.gateway;

import com.example.gamification.core.domain.RewardDomain;
import com.example.gamification.core.gateway.RewardGateway;
import com.example.gamification.dataprovider.database.mapper.EntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RewardGatewayImp implements RewardGateway {

    private final EntityMapper entityMapper;

    private final RewardRepository repository;

    @Override
    public void create(RewardDomain rewardDomain) {
        RewardEntity rewardEntity = entityMapper.toEntity(rewardDomain);

        repository.save(rewardEntity);
    }
}
