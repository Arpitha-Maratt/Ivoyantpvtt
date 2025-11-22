package inheritance;
class Bird {
    void eat() {
        System.out.println("Bird is eating");
    }
}
class Parrot extends Bird {   // Dog inherits from Animal
    void fly() {
        System.out.println("Bird is flying");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.fly();
        p.eat();
    }
}
