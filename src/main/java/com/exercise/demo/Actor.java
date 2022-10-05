package com.exercise.demo;

import java.util.ArrayList;

public class Actor{

    public static ArrayList<Actor> actors = new ArrayList<>();

    public Integer id;
    public String name;
    public String role;
    public Integer age;
    public Integer movieId;

  static {
    new Actor(1, "RDJ", "Iron Man",45,4);
    new Actor(2, "Chris Evans", "Captain America",40,4);
    new Actor(3, "Chris Hemsworth", "Thor",30,4);
    new Actor(4, "Mark Ruffalo", "The Hulk",45,4);
    new Actor(5, "Paul Rudd", "Ant Man",45,4);
  }
  public Actor(Integer id, String name, String role,Integer age,Integer movieId){
    this.id = id;
    this.name= name;
    this.role=role;
    this.age=age;
    this.movieId=movieId;

    Actor.actors.add(this);
  }
  public void add(Actor actor) {
  }
}