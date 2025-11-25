package abstractclasses;

abstract class Shape {
    abstract void draw();

    void resize(){
        System.out.println("Resize shape");
    }
}

class Circle extends Shape {
    @Override
    void draw(){
        System.out.println("Draw Circle");
    }
}

class Square extends Shape {
    @Override
    void draw(){
        System.out.println("Draw Square");
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw();
        s1.resize();

        s2.draw();
        s2.resize();

    }
}
