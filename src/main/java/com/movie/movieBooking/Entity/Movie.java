package com.movie.movieBooking.Entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    @Column
    private String description;
    @Column
    private int durationMins;
    @Column
    private  String language;
    @Column
    private String country;
    @Column
    private String genre;
    @Column
    private LocalDateTime releaseDate;

    @OneToOne(mappedBy = "movie")
    @JsonIgnore
    private MovieShow show;


    public int getMovieId() {
        return movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getDurationMins() {
        return durationMins;
    }
    public void setDurationMins(int durationMins) {
        this.durationMins = durationMins;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public MovieShow getShow() {
        return show;
    }
    public void setShow(MovieShow show) {
        this.show = show;
    }
    
}
