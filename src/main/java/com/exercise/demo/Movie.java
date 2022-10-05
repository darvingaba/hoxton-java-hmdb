package com.exercise.demo;

import java.util.ArrayList;

public class Movie{

    public static ArrayList<Movie> movies = new ArrayList<>();

    public Integer id;
    public String name;

  static {
    new Movie(4, "Avengers");
  }
  public Movie(Integer id, String name){
    this.id = id;
    this.name= name;

    Movie.movies.add(this);
  }

  public ArrayList<Actor> getActors(){
    ArrayList<Actor> actorsList= new ArrayList<>();

    for(Actor actor: Actor.actors){
        if(actor.movieId==this.id){
            actorsList.add(actor);
        }
    }
    return actorsList;
  }
}
