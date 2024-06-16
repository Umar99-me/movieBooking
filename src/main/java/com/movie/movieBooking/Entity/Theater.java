package com.movie.movieBooking.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String theaterName;

    @Column
    private String location;

    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    Set<CinemaHall> CinemaHalls;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<CinemaHall> getCinemaHalls() {
        return CinemaHalls;
    }

    public void setCinemaHalls(Set<CinemaHall> cinemaHalls) {
        CinemaHalls = cinemaHalls;
    }

    
    
}
