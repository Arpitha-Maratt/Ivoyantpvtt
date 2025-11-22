package polymorphism;
class Vehicles {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Cars extends Vehicles {
    @Override
    void start() {
        System.out.println("Car starts with a push button or key.");
    }
}
public class ReferenceVsObjectDemo {
    public static void main(String[] args) {
        Vehicles myCar = new Cars();
        myCar.start();
    }
}
