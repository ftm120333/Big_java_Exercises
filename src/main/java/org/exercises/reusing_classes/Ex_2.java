package org.exercises.reusing_classes;


/*
 Inheritance Syntax Notes:

  - When you inherit, you say “This new class is like that old class.”
  - To allow for inheritance, as a general rule make all fields private and all methods public
  - Java has the keyword super that refers to the “superclass” that the current class inherits,
    if you call the same method name of super class inside the  method  of the other class
    that would produce a recursive call
  - When inheriting you’re not restricted to using the methods of the base class. You can also
    add new methods to the derived class exactly the way you put any method in a class: Just
    define it.

    Exercise 2: (2) Inherit a new class from class Detergent. Override scrub( ) and add a
    new method called sterilize( ).
*/

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}

class Detergent extends Cleanser {
    // Change a method:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }
    // Add methods to the interface:
    public void foam() { append(" foam()"); }
    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

/*

            |Object|
                ^
                |
            |Cleanser|
                ^
                |
            |Detergent|
                ^
                |
              |ex_2|

*/
 public class Ex_2 extends Detergent {
    // Change a method:

     @Override
    public void scrub() {
        append(" ex_2.scrub()");
        super.scrub(); // Call base-class version
    }

    public void sterilize() { append(" sterilize()"); }

    public static void main(String[] args) {
        Ex_2 x = new Ex_2();
        x.scrub();
        System.out.println(x);

    }
}
