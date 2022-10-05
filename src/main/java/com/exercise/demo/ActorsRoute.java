package com.exercise.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorsRoute {
    @GetMapping("/actors")
    public ArrayList<Actor> getActors(){
      return Actor.actors;        
    }

    @GetMapping("/actor/{id}")
    public Actor getActor(@PathVariable Integer id) {
    Actor match = null;

    for (Actor actor : Actor.actors) {
      if (actor.id == id) {
        match = actor;
      }
    }

    if (match == null)
      throw new Error("Actor not found.");

    return match;
  }
  @PostMapping("/actors")
  public Actor createActor(@RequestBody Actor actor){
    return actor;
  }
}

