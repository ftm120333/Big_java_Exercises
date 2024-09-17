package org.example.reusing_classes;

/*
    Exercise 16: (2) Create a class called Amphibian. From this, inherit a class called
    Frog. Put appropriate methods in the base class. In main( ), create a Frog and upcast it to
    Amphibian and demonstrate that all the methods still work.

    Exercise 17: (1) Modify Exercise 16 so that Frog overrides the method definitions from
        the base class (provides new definitions using the same method signatures). Note what
        happens in main( ).
*/


abstract class Amphibian {
     void fly() {
        System.out.println("Flying");
    }
    public abstract void speak();
}

class Frog extends Amphibian {

    @Override
    public void speak() {
        System.out.println("Ribbit");
    }

    public static void main(String[] args) {
        Amphibian a = new Frog();
        a.fly();
        a.speak();
    }
}

