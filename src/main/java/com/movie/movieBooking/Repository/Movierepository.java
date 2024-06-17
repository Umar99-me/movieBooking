package com.movie.movieBooking.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.movie.movieBooking.Entity.Movie;

public interface Movierepository extends JpaRepository<Movie,Integer>{
}
