package com.springboot.testdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping(value = "welcome")
    public String welcome() {
        return "Welcome to first deploy project to heroku.";
    }
}
