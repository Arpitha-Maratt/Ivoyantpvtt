package tasks;

class User4 {
    String name;

    public User4(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("User: " + name);
    }
}

// Child class
class Customer5 extends User4 {
    double balance;

    public Customer5(String name, double balance) {
        super(name);
        this.balance = balance;
    }

    public void processPayment(double amount) {
        balance -= amount;
        System.out.println("Processed payment of ₹" + amount);
    }
}

public class Task9 {
    public static void main(String[] args) {

        // Reference type: User, Object type: Customer
        User4 u = new Customer5("Arpitha", 1000.0);

        u.showInfo();

        // u.processPayment(200.0); //give compile time error
    }
}