package org.example.reusing_classes;

/*
Exercise 18: (2) Create a class with a static final field and a final field and
demonstrate the difference between the two.

*/


import static org.example.reusing_classes.Data.NUMBER;

class Data {

    final String name;
    static final int NUMBER = 0;


    public Data(String name) {
        this.name = name;
    }
}


public class Ex_18 {
    public static void main(String[] args) {
        Data data = new Data("FATEMA");
        System.out.println(data.name);
        System.out.println(NUMBER);
    }
}