package org.example.reusing_classes;
import java.util.*;
/*
    protected => “This is private as far as the class user is concerned, but available to anyone who inherits
    from this class or anyone else in the same package.”


    Exercise 15: (2) Create a class inside a package. Your class should contain a protected
    method. Outside the package, try to call the protected method and explain the results.
    Now inherit from your class and call the protected method from inside a method of your
    derived class
*/


public class Ex_15 {
    protected void protectedMethod() {
        System.out.println("Protected method in BaseClass");
    }


}

class Ex_15_1 extends Ex_15{

    public void callProtectedMethod() {
        protectedMethod();
    }

    public static void main(String[] args) {
        Ex_15_1 ex_15_1 = new Ex_15_1();
        ex_15_1.callProtectedMethod();
    }
}

class Ex_15_2  {
    Ex_15 ex_15 = new Ex_15();
  //  ex_15.protectedMethod();  //this cause a compiler error
}