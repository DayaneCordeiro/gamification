package com.example.gamification.entrypoint.controller;

import com.example.gamification.entrypoint.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("api/v1/users")
public interface UsersController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void create(@RequestBody final UserDTO userDTO);

    @PostMapping("/startDay")
    @ResponseStatus(HttpStatus.OK)
    void startDay(
        @RequestHeader(value = "user-id") final String userId
    );

    @PutMapping("/updatePoints")
    @ResponseStatus(HttpStatus.OK)
    void updatePoints(
        @RequestHeader(value = "user-id") final String userId,
        @RequestBody final int points
    );
}
