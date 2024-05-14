package com.example.gamification.entrypoint.controller.imp;

import com.example.gamification.entrypoint.controller.TasksController;
import com.example.gamification.entrypoint.dto.TaskInputDto;
import com.example.gamification.entrypoint.dto.TaskOutputDto;

import java.util.List;

public class TasksControllerImp implements TasksController {
    @Override
    public void create(TaskInputDto inputDto) {

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
