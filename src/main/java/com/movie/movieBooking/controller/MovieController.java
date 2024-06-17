package com.movie.movieBooking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.movieBooking.Entity.Movie;
import com.movie.movieBooking.Repository.Movierepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    Movierepository movierepository;

    @GetMapping("movies")
    public List<Movie> getAllMovies() {
        return movierepository.findAll();
    }

    @GetMapping("movies/{id}")
    public Optional<Movie> getMovieById(@PathVariable int id ) {
        return movierepository.findById(id);
    }
    
    @PostMapping("movies")
    public Movie postMethodName(@RequestBody Movie Movie) {
        return movierepository.save(Movie);
    }
    
    
}
