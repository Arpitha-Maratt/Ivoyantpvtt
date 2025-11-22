package polymorphism;

class Birds {
    void sound() {
        System.out.println("Birds makes a sound");
    }
}

// Child class overriding sound()
class Peacock extends Birds {
    @Override
    void sound() {
        System.out.println("Peacock barks");
    }
}

class Parrot extends Birds {
    @Override
    void sound() {
        System.out.println("parrot sound");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Birds b;
        b =new Peacock();
        b.sound();

        b= new Parrot();
        b.sound();
    }
}
