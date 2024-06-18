package com.movie.movieBooking.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.movieBooking.Entity.MovieShow;

@Repository
public interface ShowsRepository extends JpaRepository<MovieShow,Integer>{

    List<MovieShow> findBycinemaHall_id(int hallId);

}
