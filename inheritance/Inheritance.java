package inheritance;

class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }

    void eat(){
        System.out.println(name +"is eating");
    }
}

class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    void bark(){
        System.out.println(name + "is barking");
    }
}
public class Inheritance {
    public static void main(String[] args) {
      Dog d = new Dog("Tommy");
      d.eat();
      d.bark();

    }

}
