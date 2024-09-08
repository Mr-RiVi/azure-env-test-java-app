package com.azure_env_test.azure_env_test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/retrieve-env")
public class ExampleController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Map<String, String>> getAllEnv() {
        Map<String, String> envVariables = System.getenv();
        return ResponseEntity.ok(envVariables);
    }
}
