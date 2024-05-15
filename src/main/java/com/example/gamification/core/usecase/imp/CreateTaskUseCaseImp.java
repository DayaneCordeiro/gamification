package com.example.gamification.core.usecase.imp;

import com.example.gamification.core.domain.TaskDomain;
import com.example.gamification.core.gateway.TaskGateway;
import com.example.gamification.core.usecase.CreateTaskUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateTaskUseCaseImp implements CreateTaskUseCase {

    private final TaskGateway gateway;

    @Override
    public void create(TaskDomain taskDomain) {
        gateway.create(taskDomain);
    }
}
