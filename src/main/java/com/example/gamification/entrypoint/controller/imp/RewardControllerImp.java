package com.example.gamification.entrypoint.controller.imp;

import com.example.gamification.entrypoint.controller.RewardController;
import com.example.gamification.entrypoint.dto.RewardInputDto;
import com.example.gamification.entrypoint.dto.RewardOutputDto;
import com.example.gamification.entrypoint.facade.RewardFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RewardControllerImp implements RewardController {

    private final RewardFacade facade;

    @Override
    public void create(RewardInputDto inputDto) {
        facade.create(inputDto);
    }

    @Override
    public void update(String userId, RewardInputDto inputDto) {

    }

    @Override
    public RewardOutputDto get(String userId, String id) {
        return null;
    }

    @Override
    public RewardOutputDto getAll(String userId) {
        return null;
    }

    @Override
    public void delete(String userId, String id) {

    }

    @Override
    public void buy(String userId, String id) {

    }
}
