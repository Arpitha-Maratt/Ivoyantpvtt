package tasks;

// Parent class
class User6 {
    private String name;
    private String email;
    public static int totalUsers = 0; // static counter

    public User6(String name, String email) {
        this.name = name;
        this.email = email;
        totalUsers++; // increment whenever a User6 object is created
    }

    public void showInfo() {
        System.out.println("User Name: " + name);
        System.out.println("User Email: " + email);
    }
}

// Customer class
class Customer7 extends User6 {
    int customerId;

    public Customer7(int customerId, String name, String email) {
        super(name, email);
        this.customerId = customerId;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Customer ID: " + customerId);
    }
}

// PremiumCustomer class
class PremiumCustomer7 extends Customer7 {
    int rewardPoints;

    public PremiumCustomer7(int customerId, String name, String email, int rewardPoints) {
        super(customerId, name, email);
        this.rewardPoints = rewardPoints;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Reward Points: " + rewardPoints);
    }
}

// Seller class
class Seller6 extends User6 {
    int sellerId;

    public Seller6(int sellerId, String name, String email) {
        super(name, email);
        this.sellerId = sellerId;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Seller ID: " + sellerId);
    }
}

// Order class (HAS-A relationship)
class Order6 {
    int orderId;
    Customer7 customer; // Fixed: must match Customer7
    double amount;

    public Order6(int orderId, Customer7 customer, double amount) {
        this.orderId = orderId;
        this.customer = customer;
        this.amount = amount;
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Customer Details:");
        customer.showInfo();
    }
}

// Main class
public class Task11 {
    public static void main(String[] args) {

        // Create multiple users
        User6 u1 = new User6("User1", "user1@gmail.com");
        User6 u2 = new User6("User2", "user2@gmail.com");

        // Create customers
        Customer7 c1 = new Customer7(101, "Arpitha", "arpitha@gmail.com");
        PremiumCustomer7 pc1 = new PremiumCustomer7(102, "Alice", "alice@gmail.com", 500);

        // Create seller
        Seller6 s1 = new Seller6(201, "Bob", "bob@gmail.com");

        // Create an order
        Order6 order1 = new Order6(301, c1, 999.50);

        // Show info
        u1.showInfo();
        System.out.println();
        u2.showInfo();
        System.out.println();
        c1.showInfo();
        System.out.println();
        pc1.showInfo();
        System.out.println();
        s1.showInfo();
        System.out.println();
        order1.showOrderDetails();

        // Print total users
        System.out.println("\nTotal Users: " + User6.totalUsers);
    }
}
