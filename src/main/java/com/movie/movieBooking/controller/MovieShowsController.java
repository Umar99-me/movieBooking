package com.movie.movieBooking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.movieBooking.Entity.MovieShow;
import com.movie.movieBooking.service.ShowService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("movieShow")
public class MovieShowsController {

    @Autowired
    ShowService showService;

    @GetMapping("show")
    public List<MovieShow> allShowsInAHall(@RequestParam(name = "hallId") int hallId) {
        return showService.getAllShowsInAHall(hallId);
    }

    @PostMapping("show")
    public MovieShow showForHall(@RequestBody MovieShow show,@RequestParam(name = "hallId") int hallId) {
        return showService.showForHall(show,hallId);
    }
    
    
}
