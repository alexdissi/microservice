package com.example.auth.controller;

import com.example.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final AuthService authService;

    @Autowired
    public AuthenticationController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody Map<String, String> payload) {
        authService.createUser(payload.get("username"), payload.get("password"));
        return ResponseEntity.ok("Account created successfully");
    }

    @PostMapping("/signin")
    public ResponseEntity<Map<String, String>> signin(@RequestBody Map<String, String> payload) {
        String token = authService.login(payload.get("username"), payload.get("password"));
        Map<String, String> response = Map.of("token", token);
        return ResponseEntity.ok(response);
    }
}
