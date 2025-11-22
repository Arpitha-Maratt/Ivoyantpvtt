package polymorphism;

class Device {
    void operate() {
        System.out.println("Operating a generic device...");
    }
}

class Laptop extends Device {
    @Override
    void operate() {
        System.out.println("Laptop is booting and running applications.");
    }
}

class Smartphone extends Device {
    @Override
    void operate() {
        System.out.println("Smartphone is starting and opening apps.");
    }
}
public class InheritanceHierarchy {
    static Device getDevice(String type) {
        if (type.equalsIgnoreCase("laptop")) {
            return new Laptop();
        } else {
            return new Smartphone();
        }
    }

    public static void main(String[] args) {

        Device d = getDevice("laptop");
        d.operate();     // Calls Laptop.operate()

        d = getDevice("smartphone");
        d.operate();     // Calls Smartphone.operate()
    }
}
