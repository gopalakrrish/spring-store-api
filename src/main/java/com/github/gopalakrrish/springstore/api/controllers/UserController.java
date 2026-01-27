package com.github.gopalakrrish.springstore.api.controllers;

import com.github.gopalakrrish.springstore.api.entities.User;
import com.github.gopalakrrish.springstore.api.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
