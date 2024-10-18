package org.exercises.polymorphism;


/*

    Exercise 2: (1) Add the @Override annotation to the shapes example.

         Whether or not you explicitly use the @Override annotation,
         if a method in a derived class has the same name and signature (same parameters
         and return type) as a method in the base class, it overrides the method from the base class.

        Key Points:
        @Override annotation is optional but highly recommended. It helps in the following ways:
        It makes the code more readable, explicitly indicating that the method is meant to override a base class method.
        It prevents mistakes: If the method signature does not exactly match a method in the base class (e.g., a typo or different parameter types),
        the compiler will raise an error. Without @Override, such an error might be overlooked.


    Exercise 3: (1) Add a new method in the base class of Shapes.java that prints a
    message, but don’t override it in the derived classes. Explain what happens. Now override it
    in one of the derived classes but not the others, and see what happens. Finally, override it in
    all the derived classes.

    No overriding: All derived classes inherit and use the base class method (Shape.message()).

    Partial overriding: Only the class where the method is overridden (e.g., Circle) uses the
    new implementation; other derived classes use the base class method.

    Full overriding: Each derived class uses its own overridden method, and
    the base class method is no longer invoked for any object of derived classes.


    Exercise 4: (2) Add a new type of Shape to Shapes.java and verify in main( ) that
    polymorphism works for your new type as it does in the old types.


*/
import java.util.Random;

class Shape {
    public void draw() {
        System.out.println("base");
    }
    public void erase() {}

    public void message() { System.out.println("base message"); }
}

class Circle extends Shape {
    @Override
    public void draw() { System.out.println("Circle.draw()"); }
    public void erase() { System.out.println("Circle.erase()"); }
}

class Square extends Shape {
    @Override
    public void draw() { System.out.println("Square.draw()"); }
    public void erase() { System.out.println("Square.erase()"); }
}
class Triangle extends Shape {
    @Override
    public void draw() { System.out.println("Triangle.draw()"); }
    public void erase() { System.out.println("Triangle.erase()"); }
}


class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch(rand.nextInt(3)) {

            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}

class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
// Fill up the array with shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
// Make polymorphic method calls:
        for(Shape shp : s)
            shp.draw();
    }
}

