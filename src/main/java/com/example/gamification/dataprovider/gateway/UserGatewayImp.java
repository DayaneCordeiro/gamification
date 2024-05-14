package com.example.gamification.dataprovider.gateway;

import com.example.gamification.core.domain.UserDomain;
import com.example.gamification.core.gateway.UserGateway;
import com.example.gamification.dataprovider.database.mapper.EntityMapper;
import com.example.gamification.dataprovider.database.repository.UserRepository;
import com.example.gamification.dataprovider.database.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserGatewayImp implements UserGateway {

    private final EntityMapper entityMapper;

    private final UserRepository repository;

    @Override
    public void create(UserDomain userDomain) {
        UserEntity userEntity = entityMapper.toEntity(userDomain);

        repository.save(userEntity);
    }
}
