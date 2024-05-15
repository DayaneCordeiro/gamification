package com.example.gamification.dataprovider.gateway;

import com.example.gamification.core.domain.TaskDomain;
import com.example.gamification.core.gateway.TaskGateway;
import com.example.gamification.dataprovider.database.entity.TaskEntity;
import com.example.gamification.dataprovider.database.mapper.EntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TaskGatewayImp implements TaskGateway {

    private final EntityMapper entityMapper;

    private final TaskRepository repository;

    @Override
    public void create(TaskDomain taskDomain) {
        TaskEntity taskEntity = entityMapper.toEntity(taskDomain);

        repository.save(taskEntity);
    }
}
