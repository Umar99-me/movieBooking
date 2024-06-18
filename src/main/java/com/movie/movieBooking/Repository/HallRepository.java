package com.movie.movieBooking.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movie.movieBooking.Entity.CinemaHall;
import com.movie.movieBooking.Entity.Theater;

@Repository
public interface HallRepository extends JpaRepository<CinemaHall,Integer>{
}
