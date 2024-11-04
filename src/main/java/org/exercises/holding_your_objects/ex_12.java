package org.exercises.holding_your_objects;

import java.util.*;

/*
    Exercise 12: (3) Create and populate a List<Integer>. Create a second List<Integer>
    of the same size as the first, and use ListIterators to read elements from the first List and
    insert them into the second in reverse order. (You may want to explore a number of different
    ways to solve this problem.)

* */
public class ex_12 {

    public static void main(String[] args) {
        List<Integer> list_1 = Arrays.asList(1, 2, 3, 4); //this is a fixed size
        List<Integer> list_2 = new ArrayList<Integer>(list_1.size());
        ListIterator iterator_1 = list_1.listIterator(list_1.size());

        while(iterator_1.hasPrevious()){
            list_2.add((Integer) iterator_1.previous());
        }
        System.out.println(list_2);
    }


}
