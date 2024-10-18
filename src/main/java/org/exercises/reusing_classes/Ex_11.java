package org.exercises.reusing_classes;

/*
    Delegation: This is midway between inheritance and composition
         because you place a member object in the class you’re building (like composition),
         but at the same time you expose all the methods from the member object in your new class
         (like inheritance)

         Exercise 11: (3) Modify Detergent.java so that it uses delegation.
*/

class Detergent2 {

    private Cleanser cleanser = new Cleanser();

    public void scrub() {
        cleanser.scrub();
    }
    public void dilute() {
        cleanser.dilute();
    }
    public void apply() {
        cleanser.apply();
    }



}
public class Ex_11 {

    public static void main(String[] args) {
        Detergent2 x = new Detergent2();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
