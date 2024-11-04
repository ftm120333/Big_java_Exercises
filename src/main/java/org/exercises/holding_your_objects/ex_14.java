package org.exercises.holding_your_objects;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/*
    Exercise 14: (3) Create an empty LinkedList<Integer>. Using a Listlterator, add
    Integers to the List by always inserting them in the middle of the List.
*/
public class ex_14 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4 ));

        for (int j = 6; j < 11; j++) {
            int middle = list.size() / 2;
            ListIterator<Integer> iterator = list.listIterator(); // Re-initialize the iterator each time
            for (int i = 0; i < middle; i++) {
                iterator.next();
            }
            iterator.add(j);
            System.out.println(list);
          }


    }
}
