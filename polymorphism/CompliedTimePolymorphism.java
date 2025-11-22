package polymorphism;

class MathOperation {


    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}
public class CompliedTimePolymorphism {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();

        System.out.println(obj.multiply(4, 5));        // calls int version
        System.out.println(obj.multiply(4.5, 5.2));    // calls double version
    }
}
