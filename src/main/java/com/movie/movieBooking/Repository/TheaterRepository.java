package com.movie.movieBooking.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.movie.movieBooking.Entity.Theater;

public interface TheaterRepository extends CrudRepository<Theater,Integer>{
}
