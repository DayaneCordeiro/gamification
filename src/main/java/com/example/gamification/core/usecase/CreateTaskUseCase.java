package com.example.gamification.core.usecase;

import com.example.gamification.core.domain.TaskDomain;

public interface CreateTaskUseCase {

    void create(TaskDomain taskDomain);
}
