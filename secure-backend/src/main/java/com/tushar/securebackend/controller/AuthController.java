package com.tushar.securebackend.controller;

import com.tushar.securebackend.dto.RegisterRequest;
import com.tushar.securebackend.service.UserService;
import org.springframework.web.bind.annotation.*;
import com.tushar.securebackend.dto.LoginRequest;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return userService.registerUser(request);
    }
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return userService.loginUser(request);
    }
}