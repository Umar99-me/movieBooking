package com.movie.movieBooking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.movieBooking.DAO.BookingDAO;
import com.movie.movieBooking.Entity.Booking;
import com.movie.movieBooking.Repository.BookingRepository;
import com.movie.movieBooking.service.BookingService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    BookingService bookingService;

    @GetMapping("booking")
    public List<Booking> getMethodName() {
        return bookingRepository.findAll();
    }
    @PostMapping("booking")
    public Booking bookMovie(@RequestBody BookingDAO booking) {
        //TODO: process POST request
        
        return bookingService.bookMovie(booking);
    }
    
    
}
