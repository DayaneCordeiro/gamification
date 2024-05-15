package com.example.gamification.entrypoint.facade;

import com.example.gamification.core.usecase.CreateRewardUseCase;
import com.example.gamification.entrypoint.dto.RewardInputDto;
import com.example.gamification.entrypoint.mapper.RewardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RewardFacade {

    private final RewardMapper mapper;

    private final CreateRewardUseCase createRewardUseCase;

    public void create(RewardInputDto inputDto) {
        RewardDomain rewardDomain = mapper.toDomain(inputDto);

        createRewardUseCase.create(rewardDomain);
    }
}
