package com.developer.tournament.service;

import com.developer.tournament.model.TourModel;
import com.developer.tournament.repository.TourRepository;
import com.developer.tournament.service.TourService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@Service
public class TourService {
    @Autowired
    private TourRepository tourRepository;

    /*public List<TourModel> saveScheduledMatches(List<TourModel> matches) {
        return tourRepository.saveAll(matches);
    }

    public List<TourModel> get(){
        return this.tourRepository.findAll();
    }*/
}