package com.example.gamification.entrypoint.facade;

import com.example.gamification.core.usecase.CreateUsersUseCase;
import com.example.gamification.entrypoint.dto.UserDTO;
import com.example.gamification.entrypoint.mapper.UsersMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UsersFacade {

    private final UsersMapper usersMapper;

    private final CreateUsersUseCase createUsersUseCase;

    public void create(UserDTO userDTO) {

    }
}
