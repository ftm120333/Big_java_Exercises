package org.examples.holding_your_objects;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args) {
       Collection<Integer> c = new ArrayList<Integer>();
       for (int i = 0; i<10; i++) {
           c.add(i);}
       for (int m: c) {
           System.out.print(m+ ", ");
       }
       }
    }
