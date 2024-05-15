package com.example.gamification.core.gateway;

import com.example.gamification.core.domain.TaskDomain;

public interface TaskGateway {

    public void create(TaskDomain taskDomain);
}
