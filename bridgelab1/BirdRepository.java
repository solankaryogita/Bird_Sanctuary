package com.bridgelab1;

import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

public class BirdRepository {
 // private List birdList = new ArrayList<>();
  private Set<Bird> birdSet = new HashSet<>();
  
   Set getBirdList() {
	  return birdSet; 
   }
   
   void add(Bird bird) {
	   birdSet.add(bird);
   }
   
   void remove(Bird bird) {
	   birdSet.remove(bird);
   }
   
   Bird getBird(String id) {
	   
	   for(Bird bird: birdSet) {
		    
		  if(bird.id.equals(id)) {
			  return bird;
		  }
	   }	   
   }
}
