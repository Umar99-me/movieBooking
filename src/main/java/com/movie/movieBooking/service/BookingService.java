package com.movie.movieBooking.service;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.movieBooking.DAO.BookingDAO;
import com.movie.movieBooking.Entity.Booking;
import com.movie.movieBooking.Entity.Seats;
import com.movie.movieBooking.Repository.BookingRepository;
import com.movie.movieBooking.Repository.SeatsRepository;
import com.movie.movieBooking.Repository.ShowsRepository;

@Service
public class BookingService {

    @Autowired
    ShowsRepository showsRepository;
    @Autowired
    SeatsRepository seatsRepository;
    @Autowired
    BookingRepository bookingRepository;

    public Booking getBooking(BookingDAO bookingDAO){
        Booking booking = new Booking();
        booking.setDoneBy(bookingDAO.getDoneBy());
        booking.setStatus(bookingDAO.getStatus());
        booking.setBookedShow(showsRepository.findById(bookingDAO.getShowId()).get());
        Set<Seats> seats= bookingDAO.getSeats().stream().map(x->seatsRepository.findById(x).get()).collect(Collectors.toSet());
        booking.setSeatsBooked(seats);
        return booking;
    }

    public Booking bookMovie(BookingDAO bookingDAO){
        return bookingRepository.save(getBooking(bookingDAO));
    }
}
