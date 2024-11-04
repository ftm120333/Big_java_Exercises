package org.exercises.holding_your_objects;

/*
    Exercise 7: (3) Create a class, then make an initialized array of objects of your class. Fill
    a List from your array. Create a subset of your List by using subList( ), then remove this
    subset from your List.
*/

import java.util.ArrayList;
import java.util.List;

public class ex_7 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list.subList(2,5));
        list.removeAll(list.subList(2,5));
        System.out.println(list);
    }

}
