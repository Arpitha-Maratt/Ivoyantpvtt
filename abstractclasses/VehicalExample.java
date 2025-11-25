package abstractclasses;


abstract class Vehicle{
    String brand;

    public Vehicle(String brand){
        this.brand=brand;
    }

    abstract void startEngine();
    void showBrand(){
        System.out.println("Brand :"+brand);
    }
}

class Car extends  Vehicle{
    int doors;

    public Car(String brand,int doors){
        super(brand);
        this.doors=doors;
    }

    @Override
    void startEngine(){
        System.out.println("Car engine started");
    }

    void showDetails(){
        showBrand();;
        System.out.println("Doors:"+doors);
    }
}
class Bike extends Vehicle {
    boolean hasCarrier;

    public Bike(String brand, boolean hasCarrier) {
        super(brand);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void startEngine() {
        System.out.println("Bike engine started");
    }

    void showDetails() {
        showBrand();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

public class VehicalExample {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 4);
        Vehicle bike = new Bike("Honda", true);

        car.startEngine(); // Car engine started
        bike.startEngine(); // Bike engine started


        ((Car) car).showDetails();
        ((Bike) bike).showDetails();
    }
}