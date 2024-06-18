package com.movie.movieBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.movieBooking.Entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {

}
