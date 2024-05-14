package com.example.gamification.entrypoint.controller;

import com.example.gamification.entrypoint.dto.RewardInputDto;
import com.example.gamification.entrypoint.dto.RewardOutputDto;
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

@RequestMapping("api/v1/reward")
public interface RewardController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void create(@RequestBody final RewardInputDto inputDto);

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(
        @RequestHeader(value = "user-id") final String userId,
        @RequestBody RewardInputDto inputDto
    );

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    RewardOutputDto get(
        @RequestHeader(value = "user-id") final String userId,
        @RequestParam final String id
    );

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    RewardOutputDto getAll(
        @RequestHeader(value = "user-id") final String userId
    );

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(
        @RequestHeader(value = "user-id") final String userId,
        @RequestParam final String id
    );

    @PostMapping("/buy")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void buy(
        @RequestHeader(value = "user-id") final String userId,
        @RequestBody String id
    );
}
