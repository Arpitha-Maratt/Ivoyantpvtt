package polymorphism;
class Calculator {


    int add(int a, int b) {
        return a + b;
    }


    double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Integer addition :"+calc.add(7,8));
        System.out.println("Doble addition:"+calc.add(8.9,7.9));

    }
}
