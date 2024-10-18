package org.exercises.reusing_classes;


/*
    Exercise 9: (2) Create a class called Root that contains an instance of each of the classes
    (that you also create) named Component1, Component2, and Component3. Derive a
    class Stem from Root that also contains an instance of each “component.” All classes should
    have default constructors that print a message about that class.


    Exercise 10: (1) Modify the previous exercise so that each class only has non-default
    constructors.

    Exercise 12: (3) Add a proper hierarchy of dispose( ) methods to all the classes in
    Exercise 9.
*/

class Component1{

    Component1(){
        System.out.println("Component1");
    }
    void dispose(){
        System.out.println("Component1 dispose");
    }
}
class Component2{

    Component2(){
        System.out.println("Component2");
    }
    void dispose(){
        System.out.println("Component2 dispose");
    }
}
class Component3{

    Component3(){
        System.out.println("Component3");   }

    void dispose(){
        System.out.println("Component3 dispose");
    }

}

class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
}

class Stem extends Root{
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
}

public class Ex_9_10_12 {

    public static void main(String[] args) {
        Stem s = new Stem();
        s.c1.dispose();
        s.c2.dispose();
        s.c3.dispose();
    }
}
