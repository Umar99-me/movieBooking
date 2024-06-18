package com.movie.movieBooking.service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.movieBooking.Entity.CinemaHall;
import com.movie.movieBooking.Entity.Seats;
import com.movie.movieBooking.Repository.HallRepository;
import com.movie.movieBooking.Repository.SeatsRepository;

@Service
public class CinemaHallService {

    @Autowired
    HallRepository hallRepository;
    @Autowired
    SeatsRepository seatsRepository;
    public CinemaHall newHall(CinemaHall hall){
        Set<Seats> seatsOfAHall = hall.getAllSeats().stream().map(x->{x.setHallSeats(hall);
        return x;}).collect(Collectors.toSet());
        hall.setAllSeats(seatsOfAHall);
        hallRepository.save(null);
        return hall;
    }

    public String newSeatToHall(int hallId, int seatId){
      hallRepository.findById(hallId).ifPresent(hall -> {
        Seats seat = seatsRepository.findById(seatId).get();
        seat.setHallSeats(hall);
        hall.getAllSeats().add(seat);
        hallRepository.save(hall);
      });
      return "Seat Added";
    }
}
