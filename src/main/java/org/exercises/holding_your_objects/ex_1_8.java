package org.exercises.holding_your_objects;


/*
    Exercise 1: (2) Create a new class called Gerbil with an int gerbilNumber that’s
    initialized in the constructor. Give it a method called hop( ) that displays which gerbil
    number this is, and that it’s hopping. Create an ArrayList and add Gerbil objects to the
    List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil.
* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Gerbil {
    int gerbilNumber;
    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }
    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " is hopping.");
    }
}


public class ex_1_8 {
    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<Gerbil>();


        for(int i = 0; i < 3; i++) {
            gerbils.add(new Gerbil(i));
        }

//      for(Gerbil g: gerbils) {
//        g.hop();
//      }

        // Create the iterator after the list is populated otherwise I got ConcurrentModificationException
      Iterator<Gerbil> iterator = gerbils.iterator();
       while(iterator.hasNext()) {
        Gerbil g = iterator.next();
        g.hop();
      }
    }
}