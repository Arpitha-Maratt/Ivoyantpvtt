package exception;

public class ThrowException {
    static void checkAge(int age){
        if(age <  18){
            throw new ArithmeticException("Age must be 18 or more");
        }
    }
    public static void main(String[] args) {
        checkAge(16);
    }
}
