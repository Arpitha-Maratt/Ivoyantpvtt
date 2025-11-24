package interfaces;

// Interface
interface Vehicles {
    void start();
    void stop();
}

// Class implements interface
class Cars implements Vehicles {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

// Main
public class InterfaceUsingClasses{
public static void main(String[] args) {
        Vehicle myCar = new Car(); // upcasting
        myCar.start();
        myCar.stop();
    }
}


