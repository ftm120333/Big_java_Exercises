package org.example.reusing_classes;


/*
Constructors with arguments:


         [Game]
           ^
           |
        [BoardGame]
           ^
           |
        [Chess]

*/



/*


    If you don’t call the base-class constructor in BoardGame( ), the compiler will complain
    that it can’t find a constructor of the form Game( ). In addition, the call to the base-class
    constructor must be the first thing you do in the derived-class constructor. (The compiler will
    remind you if you get it wrong.)

    Exercise 6: (1) Using Chess.java, prove the statements in the previous paragraph.
  answer:
    got this error when delete super(i);
    There is no parameterless constructor available in 'org.example.reusing_classes.Game'

*/

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }

}
class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        //  super(i);
        System.out.println("BoardGame constructor");
    }
}

class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}

