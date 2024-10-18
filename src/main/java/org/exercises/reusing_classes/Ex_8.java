package org.exercises.reusing_classes;

/*
    Exercise 8: (1) Create a base class with only a non-default constructor, and a derived
    class with both a default (no-arg) and non-default constructor. In the derived-class
    constructors, call the base-class constructor.

    answer: yes
*/


class Base {
    Base(int i) {
        System.out.println("Base constructor");}
}

class Derived extends Base {
    Derived() {
        super(11);
        System.out.println("Derived constructor");
    }

    Derived(int i) {
        super(i);
        System.out.println("Derived constructor with args");
    }
}
public class Ex_8 {

    public static void main(String[] args) {
        Derived d = new Derived();
        Derived d2 = new Derived(11);
    }
}
