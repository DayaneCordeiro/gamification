package com.example.gamification.entrypoint.controller.imp;

import com.example.gamification.entrypoint.controller.TasksController;
import com.example.gamification.entrypoint.dto.TaskInputDto;
import com.example.gamification.entrypoint.dto.TaskOutputDto;
import com.example.gamification.entrypoint.facade.TaskFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TasksControllerImp implements TasksController {

    private final TaskFacade facade;

    @Override
    public void create(TaskInputDto inputDto) {
        facade.create(inputDto);
    }

    @Override
    public void update(String id, TaskInputDto inputDto) {

    }

    @Override
    public TaskOutputDto get(String userId, String id) {
        return null;
    }

    @Override
    public List<TaskOutputDto> getAll(String userId) {
        return null;
    }

    @Override
    public void delete(String userId, String id) {

    }

    @Override
    public void updateStatus(String userId, String status) {

    }
}
