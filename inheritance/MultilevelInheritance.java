package inheritance;

class Birds {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Peacock extends Birds {   // Dog inherits from Animal
    void fly() {
        System.out.println("Peacock is flying");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Peacock p = new Peacock();
        p.fly();
        p.eat();
    }
}
