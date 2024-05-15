package com.example.gamification.entrypoint.facade;

import com.example.gamification.entrypoint.dto.TaskInputDto;
import com.example.gamification.entrypoint.mapper.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TaskFacade {

    private final TaskMapper mapper;

    private final CreateTaskUseCase createTaskUseCase;

    public void create(TaskInputDto inputDto) {
        TaskDomain taskDomain = mapper.toDomain(inputDto);

        createTaskUseCase.create(taskDomain);
    }
}
