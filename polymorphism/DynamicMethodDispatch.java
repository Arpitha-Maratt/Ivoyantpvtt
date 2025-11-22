package polymorphism;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key or push button.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick or self-start.");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car();      // Car object
        v.start();          // Output: Car starts with a key or push button.

        v = new Bike();     // Bike object
        v.start();          // Output: Bike starts with a kick or self-start.

        v = new Vehicle();  // Vehicle object
        v.start();          // Output: Vehicle is starting...
    }
}
