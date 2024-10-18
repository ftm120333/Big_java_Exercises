package org.exercises.polymorphism;

/*
    Exercise 9: (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,
    etc. In the base class, provide methods that are common to all Rodents, and override these
    in the derived classes to perform different behaviors depending on the specific type of
    Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call
    your base-class methods to see what happens.

    Exercise 12: (3) Modify Exercise 9 so that it demonstrates the order of initialization of
    the base classes and derived classes. Now add member objects to both the base and derived
    classes and show the order in which their initialization occurs during construction.
*/

class Member {
    public Member(String name) {
        System.out.println(name + " member initialized");
    }
}

class Rodent {
    // Member of the base class
    Member baseMember = new Member("Rodent");

    // Base class constructor
    public Rodent() {
        System.out.println("Rodent constructor");
    }

    // Base class methods
    void eat() { System.out.println("Rodent.eat()"); }
    void sleep() { System.out.println("Rodent.sleep()"); }
}

class Mouse extends Rodent {
    // Member of the derived class
    Member mouseMember = new Member("Mouse");

    // Derived class constructor
    public Mouse() {
        System.out.println("Mouse constructor");
    }

    // Overriding methods
    void eat() { System.out.println("Mouse.eat()"); }
    void sleep() { System.out.println("Mouse.sleep()"); }
}

class Gerbil extends Rodent {
    // Member of the derived class
    Member gerbilMember = new Member("Gerbil");

    // Derived class constructor
    public Gerbil() {
        System.out.println("Gerbil constructor");
    }

    // Overriding methods
    void eat() { System.out.println("Gerbil.eat()"); }
    void sleep() { System.out.println("Gerbil.sleep()"); }
}

class Hamster extends Rodent {
    // Member of the derived class
    Member hamsterMember = new Member("Hamster");

    // Derived class constructor
    public Hamster() {
        System.out.println("Hamster constructor");
    }

    // Overriding methods
    void eat() { System.out.println("Hamster.eat()"); }
    void sleep() { System.out.println("Hamster.sleep()"); }
}

class Ex_9 {
    public static void main(String[] args) {
        // Array of Rodent objects
        Rodent[] animals = {new Mouse(), new Gerbil(), new Hamster()};

        // Call methods to show polymorphism
        for (Rodent r : animals) {
            r.eat();
            r.sleep();
        }
    }
}
