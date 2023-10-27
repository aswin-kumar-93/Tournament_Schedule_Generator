package com.developer.tournament.controller;


import com.developer.tournament.model.TourModel;
import com.developer.tournament.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/tour")
public class TourController {
    @Autowired
    private TourService tourService;
    @GetMapping
    public List<TourModel> get() {
        return tourService.get();
    }
    @PostMapping("/tour")
    public void saveScheduledMatches(@RequestBody List<TourModel> matches) {
        tourService.saveScheduledMatches(matches);
        System.out.println("Saved");
    }
    @PostMapping
    public ResponseEntity<String> saveMatches(@RequestBody List<TourModel> matches) {
        return ResponseEntity.ok("Matches saved successfully");
    }
}
