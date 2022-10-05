package com.exercise.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesRoute {
    @GetMapping("/movies")
    public ArrayList<Movie> getMovies(){ 
      return Movie.movies;        
    }
    @PostMapping("/movies")
    public Movie createMovie(@RequestBody Movie movie){
    return movie;
  }
}



