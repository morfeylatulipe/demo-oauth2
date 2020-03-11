package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class IndexController {
    @GetMapping
    public ResponseEntity index() {
        Map<Object, Object> response = new HashMap<>();
        response.put("POST /api/v1/auth/registration", "String username, String password | User registredUser");
        response.put("POST /api/v1/auth/login", "String username, String password | String username, String token");
        return ResponseEntity.ok(response);
    }
}
