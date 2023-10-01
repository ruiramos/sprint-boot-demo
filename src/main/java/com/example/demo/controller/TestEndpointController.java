package com.example.demo.controller;

import com.example.demo.dto.DemoTestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndpointController {

    @GetMapping(produces = "application/json")
    public ResponseEntity<DemoTestResponse> getDemoResponse(
            @RequestParam(required = true, defaultValue = "world") String name){
        return ResponseEntity.ok(DemoTestResponse.builder().name(name).build());
    }

}
