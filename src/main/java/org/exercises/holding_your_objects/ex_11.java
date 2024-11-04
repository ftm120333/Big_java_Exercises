package org.exercises.holding_your_objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
    Exercise 11: (2) Write a method that uses an Iterator to step through a Collection and
    print the toString( ) of each object in the container. Fill all the different types of
    Collections with objects and apply your method to each container.
* */
public class ex_11 {

    void IteratingMethod(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().toString());
    }
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Collection collection1 = new LinkedHashSet();
        for (int i = 0; i < 10; i++) {
            collection.add(i);
            collection1.add(i);
        }
        new ex_11().IteratingMethod(collection);
        new ex_11().IteratingMethod(collection1);
    }
}
