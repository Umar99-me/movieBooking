package com.movie.movieBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.movieBooking.Entity.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater,Integer>{
}
