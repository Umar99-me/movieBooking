package com.movie.movieBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.movieBooking.Entity.MovieShow;
import com.movie.movieBooking.Repository.HallRepository;
import com.movie.movieBooking.Repository.ShowsRepository;

@Service
public class ShowService {

    @Autowired
    ShowsRepository showsRepository;
    @Autowired
    HallRepository hallRepository;

    public List<MovieShow> getAllShowsInAHall(int hallId){
        return showsRepository.findBycinemaHall_id(hallId);
    }

    public MovieShow showForHall(MovieShow show,int hallId) {
        hallRepository.findById(hallId).ifPresent(hall -> {
            show.setCinemaHall(hall);
            hall.getMovieShows().add(show);
            hallRepository.save(hall);
        });
        return show;
    }

}
