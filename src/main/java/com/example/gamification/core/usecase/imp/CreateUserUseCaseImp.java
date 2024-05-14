package com.example.gamification.core.usecase.imp;

import com.example.gamification.core.domain.UserDomain;
import com.example.gamification.core.gateway.UserGateway;
import com.example.gamification.core.usecase.CreateUsersUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUserUseCaseImp implements CreateUsersUseCase {

    private final UserGateway gateway;

    @Override
    public void create(UserDomain userDomain) {
        gateway.create(userDomain);
    }
}
