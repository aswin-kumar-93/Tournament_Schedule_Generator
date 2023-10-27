package com.developer.tournament.repository;

import com.developer.tournament.model.TourModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface TourRepository extends JpaRepository<TourModel,Integer> {
}