package com.movie.movieBooking.Entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Seats {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seatNo;

    @Column
    private String seatClass;

    @ManyToOne()
    @JoinColumn(name = "cinemaHall_ID")
    @JsonIgnore
    private CinemaHall hallSeats;

    @ManyToMany(mappedBy = "seatsBooked")
    private Set<Booking> bookings;

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public CinemaHall getHallSeats() {
        return hallSeats;
    }

    public void setHallSeats(CinemaHall hallSeats) {
        this.hallSeats = hallSeats;
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }

    
    
}
