package polymorphism;


    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public class PolymorphismExample{
        public static void main(String[] args) {

            Animal a;  // reference variable of parent class

            a = new Dog();   // runtime polymorphism
            a.sound();       // Dog barks

            a = new Cat();   // runtime polymorphism
            a.sound();       // Ca meows
        }
    }


