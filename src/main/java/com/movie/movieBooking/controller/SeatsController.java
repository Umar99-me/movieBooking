package com.movie.movieBooking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.movieBooking.Entity.Seats;
import com.movie.movieBooking.Repository.SeatsRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("seat")
public class SeatsController {

    @Autowired
    SeatsRepository seatsRepository;

    @GetMapping("seats")
    public List<Seats> getAllSeats(@RequestParam String param) {
        return seatsRepository.findAll();
    }
    
    @PostMapping("seats")
    public Seats postMethodName(@RequestBody Seats seat) {
        //TODO: process POST request
        
        return seatsRepository.save(seat);
    }
    
}
