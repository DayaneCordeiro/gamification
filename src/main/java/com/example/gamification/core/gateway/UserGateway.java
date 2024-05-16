package com.example.gamification.core.gateway;

import com.example.gamification.core.domain.UserDomain;

public interface UserGateway {

    public void save(UserDomain userDomain);

    public UserDomain get(String id);
}
