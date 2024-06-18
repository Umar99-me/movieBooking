package com.movie.movieBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.movieBooking.Entity.Seats;

@Repository
public interface SeatsRepository extends JpaRepository<Seats,Integer>{

}
