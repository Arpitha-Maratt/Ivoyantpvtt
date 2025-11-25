package interfaces;

interface Shape {
    void draw();
    void resize();
}
class Circles implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }

    @Override
    public void resize(){
        System.out.println("Resize circles");
    }
}

class Squares implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing squares");
    }

    @Override
    public void resize(){
        System.out.println("Resize squares");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {

        Shape s1 = new Circles();
        Shape s2 = new Squares();

        s1.draw();
        s1.resize();

        s2.draw();
        s2.resize();
    }
}
