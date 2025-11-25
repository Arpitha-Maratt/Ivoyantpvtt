package abstractclasses;

abstract class Animal{
    String name;

    public Animal(String name){
        this.name=name;
    }

    abstract void makeSound();

    void sleep(){
        System.out.println(name + " is sleepimg");
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println(name + " says: woof woof");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says : meow meow");
    }
}
public class AnimalExampleForAbstractClass {
    public static void main(String[] args) {
        Animal dog = new Dog("Tommy");
        Animal cat = new Cat("Whiskers");

        dog.makeSound();
        dog.sleep();

        cat.sleep();
        cat.makeSound();
    }
}
