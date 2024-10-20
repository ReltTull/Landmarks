package org.example.service;

import org.example.entity.Landmark;
import org.example.repository.LandmarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LandmarksService {

    private final LandmarksRepository landmarksRepository;

    @Autowired
    public LandmarksService(LandmarksRepository landmarksRepository) {
        this.landmarksRepository = landmarksRepository;
    }
    public String test() {
        return "Count: " + landmarksRepository.count();
    }
}
