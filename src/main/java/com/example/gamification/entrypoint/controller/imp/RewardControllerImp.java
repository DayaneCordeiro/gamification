package com.example.gamification.entrypoint.controller.imp;

import com.example.gamification.entrypoint.controller.RewardController;
import com.example.gamification.entrypoint.dto.RewardInputDto;
import com.example.gamification.entrypoint.dto.RewardOutputDto;

public class RewardControllerImp implements RewardController {
    @Override
    public void create(RewardInputDto inputDto) {

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
