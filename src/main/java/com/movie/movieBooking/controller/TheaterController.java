package com.movie.movieBooking.controller;

import org.springframework.web.bind.annotation.RestController;

import com.movie.movieBooking.Entity.CinemaHall;
import com.movie.movieBooking.Entity.Theater;
import com.movie.movieBooking.Repository.HallRepository;
import com.movie.movieBooking.Repository.TheaterRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("theater")
public class TheaterController {

    @Autowired
    TheaterRepository theaterRepository;

    @Autowired
    HallRepository hallRepository;

    @GetMapping("theaters")
    public List<Theater> findAlltheaters() {
        return (List<Theater>) theaterRepository.findAll();
    }
    
    @PostMapping("/theaters")
    public Theater newTheater(@RequestBody Theater theater) {

        return theaterRepository.save(theater);
    }
    // @PostMapping("/newHall")
    // public CinemaHall newHall(@RequestBody CinemaHall hall) {

    //     return hallRepository.save(hall);
    // }
    
}
