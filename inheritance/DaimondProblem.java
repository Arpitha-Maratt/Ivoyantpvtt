package inheritance;

interface A1 {
    void doSomething();
}

class B1 implements A1 {
    public void doSomething() {

        System.out.println("Method in class B");
    }
}

class C1 implements A1 {
    public void doSomething() {

        System.out.println("Method in class C");
    }
}

class D1 implements A1 {
    public void doSomething() {

        System.out.println("Method in class D");
    }
}

public class DaimondProblem {
    public static void main(String[] args) {
        A1 obj = new D1();
        obj.doSomething();
    }
}
