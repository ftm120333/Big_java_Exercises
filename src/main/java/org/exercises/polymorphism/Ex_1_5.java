package org.exercises.polymorphism;
/*
    Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
    Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.

    Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which
    returns the number of wheels. Modify ride( ) to call wheels( ) and verify that
    polymorphism works.
    */

class Cycle{

    public void Cycle(){
        System.out.println("base class cycle");
    }
    public int wheels(int wheels){
        return wheels;
    }
}

class Unicycle extends Cycle{

    public void Unicycle(){
        System.out.println("Unicycle");
    }
}

class Bicycle extends Cycle{

    public void Bicycle(){
        System.out.println("Bicycle");


    }
}

class Tricycle extends Cycle{

    public void Tricycle(){
        System.out.println("Tricycle");

    }
}

class Ex_1 {

    public static void ride(Cycle c){
        System.out.println("Riding a " + c.getClass().getSimpleName());
        System.out.println(c.wheels(2));
    }
    public static void main(String[] args) {

        Bicycle c = new Bicycle();
        ride(c);

        Tricycle t = new Tricycle();
        ride(t);
    }
}