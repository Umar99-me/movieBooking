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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class CinemaHall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String hallName;

    @Column
    private int totalSeats;

    @OneToMany(mappedBy = "hallSeats",cascade = CascadeType.ALL)
    Set<Seats> allSeats;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "theater_id", nullable = false)
    @JsonIgnore
    private Theater theater;

    @OneToMany(mappedBy = "cinemaHall",cascade = CascadeType.ALL)
    Set<MovieShow> movieShows;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public Set<MovieShow> getMovieShows() {
        return movieShows;
    }

    public void setMovieShows(Set<MovieShow> movieShows) {
        this.movieShows = movieShows;
    }

    public Set<Seats> getAllSeats() {
        return allSeats;
    }

    public void setAllSeats(Set<Seats> allSeats) {
        this.allSeats = allSeats;
    }

}
