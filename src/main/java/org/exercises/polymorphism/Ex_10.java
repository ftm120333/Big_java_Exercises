package org.exercises.polymorphism;


/*
    Exercise 10: (3) Create a base class with two methods. In the first method, call the
    second method. Inherit a class and override the second method. Create an object of the
    derived class, upcast it to the base type, and call the first method. Explain what happens.

    ==> at the run time the overridden method is called this is because of the polymorphism
* */

class Base {
    void method1() {
        method2();
    }
    void method2() {
        System.out.println("Base.method2()");
    }
}

public class Ex_10 extends Base {

    @Override
    void method2() {
        System.out.println("Ex_10.method2()");
    }

    public static void main(String[] args) {
        Base b = new Ex_10();
        b.method1();
    }
}
