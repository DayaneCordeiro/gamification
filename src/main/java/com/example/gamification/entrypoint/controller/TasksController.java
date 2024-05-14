package com.example.gamification.entrypoint.controller;

import com.example.gamification.entrypoint.dto.TaskInputDto;
import com.example.gamification.entrypoint.dto.TaskOutputDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RequestMapping("api/v1/task")
public interface TasksController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void create(
        @RequestBody final TaskInputDto inputDto
    );

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(
        @RequestParam final String id,
        @RequestBody final TaskInputDto inputDto
    );

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    TaskOutputDto get(
        @RequestHeader(value = "user-id") final String userId,
        @RequestParam final String id
    );

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<TaskOutputDto> getAll(
        @RequestHeader(value = "user-id") final String userId
    );

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(
        @RequestHeader(value = "user-id") final String userId,
        @RequestParam final String id
    );

    @PutMapping("/updateStatus")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void updateStatus(
        @RequestHeader(value = "user-id") final String userId,
        @RequestBody final String status
    );

}
