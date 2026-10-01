package com.pioneers.service.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class WelcomeController {

    @PostMapping("student/{name}")
    public String welcomeStudentApi(@PathVariable final String name) {
        return "Welcome " + name + " to Advanced Java and Spring Boot with Docker";
    }
}
