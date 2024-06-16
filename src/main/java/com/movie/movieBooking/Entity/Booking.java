package com.movie.movieBooking.Entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String status;

    @Column
    private String doneBy;

    @ManyToOne(cascade =  CascadeType.ALL)
    @JoinColumn(name = "showID")
    private MovieShow bookedShow;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "Booked_Seats",
               joinColumns = @JoinColumn(name = "booking_id"),
               inverseJoinColumns = @JoinColumn(name = "seat_id"))
    private Set<Seats> seatsBooked;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDoneBy() {
        return doneBy;
    }

    public void setDoneBy(String doneBy) {
        this.doneBy = doneBy;
    }

    public MovieShow getBookedShow() {
        return bookedShow;
    }

    public void setBookedShow(MovieShow bookedShow) {
        this.bookedShow = bookedShow;
    }

    public Set<Seats> getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(Set<Seats> seatsBooked) {
        this.seatsBooked = seatsBooked;
    }
    
}
