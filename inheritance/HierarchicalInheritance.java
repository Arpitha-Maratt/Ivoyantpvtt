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
class Hen extends Bird{
    void sound(){
        System.out.println("Hen make sound kho kho");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
       Parrots p = new Parrots();
        p.fly();
        p.eat();

        Hen h = new Hen();
        h.eat();
        h.sound();
    }
}
