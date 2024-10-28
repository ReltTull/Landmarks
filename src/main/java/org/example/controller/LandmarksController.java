package org.example.controller;

import org.example.service.LandmarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/landmarks")
public class LandmarksController {

    private final LandmarksService landmarksService;
    @Autowired
    public LandmarksController(LandmarksService landmarksService) {
        this.landmarksService = landmarksService;
    }

    @GetMapping("/test-connection")
    public String testConnection() {
        return landmarksService.test();
    }
}
