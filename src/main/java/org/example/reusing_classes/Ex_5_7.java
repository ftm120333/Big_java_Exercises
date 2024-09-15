package org.example.reusing_classes;


/*
 - When you create an object of the derived class, it contains within it
    a subobject of the base class.

 - the base class is initialized before the derived-class constructors can access it.
   Even if you don’t create a constructor, the compiler will synthesize a default constructor
   for you that calls the base class constructor.


    Exercise 5: (1) Create two classes, A and B, with default constructors (empty argument
    lists) that announce themselves. Inherit a new class called C from A, and create a member of
    class B inside C. Do not create a constructor for C. Create an object of class C and observe
    the results.




    Exercise 7: (1) Modify Exercise 5 so that A and B have constructors with arguments
    instead of default constructors. Write a constructor for C and perform all initialization within
    C’s constructor.

*/



class A{
    A(String type){
        System.out.println("A is " + type);
    }
}

class B{
    B(String type){
        System.out.println("B is " + type);
    }
}


class C extends A{
    B b = new B("letter");

    C(String type) {
        super(type);
    }
}

public class Ex_5_7 {

    public static void main(String[] args) {
        C c = new C("letter");
        System.out.println(c);
    }

}
