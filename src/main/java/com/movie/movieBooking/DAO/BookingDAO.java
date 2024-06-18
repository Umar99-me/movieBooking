package com.movie.movieBooking.DAO;

import java.util.List;

public class BookingDAO {

    private int id;
    private String status;
    private String doneBy;
    private int showId;
    private List<Integer> seats;

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
    public int getShowId() {
        return showId;
    }
    public void setShowId(int showId) {
        this.showId = showId;
    }
    public List<Integer> getSeats() {
        return seats;
    }
    public void setSeats(List<Integer> seats) {
        this.seats = seats;
    }

    

}
