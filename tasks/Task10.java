package tasks;

// Parent class
class User5 {
    String name;
    String email;

    public User5(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void showInfo() {
        System.out.println("User Name: " + name);
        System.out.println("User Email: " + email);
    }
}

// Child class
class Customer6 extends User5 {
    int customerId;

    public Customer6(int customerId, String name, String email) {
        super(name, email); // ✅ Call parent constructor
        this.customerId = customerId;
    }

    @Override
    public void showInfo() {
        super.showInfo(); // ✅ Call parent method
        System.out.println("Customer ID: " + customerId);
    }
}

public class Task10 {
    public static void main(String[] args) {
        Customer6 c = new Customer6(101, "Arpitha", "arpitha@gmail.com");
        c.showInfo();
    }
}

