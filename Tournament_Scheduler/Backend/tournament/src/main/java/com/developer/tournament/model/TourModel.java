package com.developer.tournament.model;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;

@Entity
@CrossOrigin(origins = "http://localhost:4200")
@Table(name = "tourdb")
public class TourModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="teams")
    private String teamName;
    public TourModel() {
    }

    public TourModel(int id,String teamName) {
        this.id=id;
        this.teamName = teamName;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


}