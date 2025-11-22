package polymorphism;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}
public class InterfacePolymorphism {
    public static void main(String[] args) {

        Shape shape;

        shape = new Circle();
        shape.draw();

        shape = new Square();
        shape.draw();
    }
}
