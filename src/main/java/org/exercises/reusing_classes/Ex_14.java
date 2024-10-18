package org.exercises.reusing_classes;
/*

   - When you inherit, you take an existing class and make a special version of it. In general, this
    means that you’re taking a general-purpose class and specializing it for a particular need.


    Exercise 14: (1) In Car.java add a service( ) method to Engine and call this method
    in main( ).
*/
class Engine {
    public void start() {}
    public void rev() {}
    public void stop() {}
    public void service() {}
}
class Wheel {
    public void inflate(int psi) {}
}
class Window {
    public void rollup() {}
    public void rolldown() {}
}
class Door {
    public Window window = new Window();
    public void open() {}
    public void close() {}
}

class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
            left = new Door(),
            right = new Door(); // 2-door
    public Car() {
        for(int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.engine.service();
    }

}

