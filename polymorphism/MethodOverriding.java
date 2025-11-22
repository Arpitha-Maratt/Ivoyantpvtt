package polymorphism;
class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dogs extends Animals {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animals a = new Dogs();
        a.sound();
    }
}