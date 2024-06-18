package com.movie.movieBooking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.movieBooking.Entity.CinemaHall;
import com.movie.movieBooking.Repository.HallRepository;
import com.movie.movieBooking.service.CinemaHallService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("hall")
public class CinemaHallController {

    @Autowired
    CinemaHallService cinemaHallService;

    @Autowired
    HallRepository hallRepository;
    @GetMapping("halls")
    public List<CinemaHall> allHalls() {
        return hallRepository.findAll();
    }
    

    @PostMapping("halls")
    public CinemaHall newCinemaHall(@RequestBody CinemaHall hall) {        
        return cinemaHallService.newHall(hall);
    }
    
    @GetMapping("availableSeat")
    public String newSeatTohall(@RequestParam(name = "hall_id") int hallId,@RequestParam(name = "seat_id") int seatId) {
        return cinemaHallService.newSeatToHall(hallId, seatId);
    }
    

}
