package inheritance;

class Animals {

    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dogs extends Animals {   // Dog inherits from Animal
    void bark() {
        System.out.println("Dog is barking");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.eat();
        d.bark();
    }
}
