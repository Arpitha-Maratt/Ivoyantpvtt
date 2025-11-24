package interfaces;

interface Vehicaless{
    void start();
    void stop();
}

public class InterfaceUsingAnonymous {
    public static void main(String[] args) {
        Vehicaless bike = new Vehicaless() {
            @Override
            public void start() {
                System.out.println("Bike started");
            }

            @Override
            public void stop() {
                System.out.println("Bikes is stopped");
            }
        };

        bike.start();
        bike.stop();
    }
}
