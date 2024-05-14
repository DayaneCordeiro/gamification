package com.example.gamification.entrypoint.controller.imp;

import com.example.gamification.entrypoint.controller.UsersController;
import com.example.gamification.entrypoint.dto.UserDTO;
import com.example.gamification.entrypoint.facade.UsersFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UsersControllerImp implements UsersController {

    private final UsersFacade facade;

    @Override
    public void create(UserDTO userDTO) {
        facade.create(userDTO);
    }

    @Override
    public void startDay(String userId) {

    }

    @Override
    public void updatePoints(String userId, int points) {

    }
}
