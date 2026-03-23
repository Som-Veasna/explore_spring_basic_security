package com.sna.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")             // ← add this
    public String root() {
        return "Welcome! You are logged in.";
    }

    @GetMapping("/default")
    public String defaultEndpoint() {
        return "Public - no login needed";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "Hello USER (or ADMIN)!";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Hello ADMIN only!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello - ADMIN only!";
    }
}