package interfaces;

interface Vehicle {
    void start();

    void stop();
}
class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop(){
        System.out.println("Car is stopped");
    }
}

class Bike implements Vehicle {
    @Override
    public void  start(){
        System.out.println("Bike is starting");
    }

    @Override
    public void stop(){
        System.out.println("Bike has stopped");
    }
}
public class InterfaceVehicleExample {
    public static void main(String[] args) {

        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        myBike.stop();
        myBike.stop();
    }
}
