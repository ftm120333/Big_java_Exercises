package org.exercises.reusing_classes;
/*

Code reuse mechanisms:
  1)Composition
  2)Inheritance

Composition syntax Notes:

 - Every non-primitive object has a toString( ) method,and it’s called in special situations
 when the compiler wants a String, but it has an object.

 - Primitives that are fields in a class are automatically initialized to zero, But the
   object references are initialized to null
 - Reference initialization ways:
    1. At the point the objects are defined. This means that they’ll always be initialized
    before the constructor is called.

    2. In the constructor for that class.

    3. Right before you actually need to use the object. This is often called lazy
    initialization. It can reduce overhead in situations where object creation is expensive
    and the object doesn’t need to be created every time.

    4. Using instance initialization.


Exercise 1: (2) Create a simple class. Inside a second class,
define a reference to an object of the first class. Use lazy
initialization to instantiate this object.
*/
class Coffee{
   String type;
   double prics;

   public Coffee(String type, double prics){
       this.type = type;
       this.prics = prics;
   }
}

public class Ex_1 {

    public static void main(String[] args) {
        Coffee coffee = new Coffee("latte", 1.5);
        System.out.println(coffee.type + " " + coffee.prics);
    }
}

