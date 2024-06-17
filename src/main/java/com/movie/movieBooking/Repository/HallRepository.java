package com.movie.movieBooking.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.movie.movieBooking.Entity.CinemaHall;
import com.movie.movieBooking.Entity.Theater;

public interface HallRepository extends CrudRepository<CinemaHall,Integer>{

    List<CinemaHall> findAll();
    @SuppressWarnings("unchecked")
    CinemaHall save(CinemaHall theater);
}
