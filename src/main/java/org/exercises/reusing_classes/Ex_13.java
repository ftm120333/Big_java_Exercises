package org.exercises.reusing_classes;

/*
    Exercise 13: (2) Create a class with a method that is overloaded three times. Inherit a
    new class, add a new overloading of the method, and show that all four methods are available
    in the derived class.

    ??Need Explanation
*/

class Base2 {
    public void f() {
        System.out.println("Base.f()");
    }
    public void f(int i) {
        System.out.println("Base.f(int)");
    }
    public void f(int i, int j) {
        System.out.println("Base.f(int, int)");
    }
}

class Derived2 extends Base2 {
    public void f() {
        System.out.println("Derived.f()");
    }
    public void f(int i) {
        System.out.println("Derived.f(int)");
    }
    public void f(int i, int j) {
        System.out.println("Derived.f(int, int)");
    }
}

public class Ex_13 {

    public static void main(String[] args) {
        Derived2 d = new Derived2();
        d.f();
        d.f(1);
        d.f(1, 2);

    }
}
