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
class Parrots extends Peacock{
    void sound(){
        System.out.println("Parrot make a sound");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Parrots p = new Parrots();
        p.sound();
        p.fly();
        p.eat();
    }
}
