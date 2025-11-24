package tasks;

/*6. Create Class: Order (HAS-A Relationship)
Variables: orderId, Customer customer, double amount
Constructor should use this
Method: showOrderDetails()
(Print order details + call customer.showInfo())*/

class Customer2{
    String name;
    String email;

    public Customer2(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void showInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
    }
}

class Order {
    int orderId;
    Customer2 customer;
    double amount;

    public Order(int orderId, Customer2 customer, double amount) {
        this.orderId = orderId;
        this.customer = customer;
        this.amount = amount;

    }
        public void showOrderDetails () {
            System.out.println("OrderId:" + orderId);
            System.out.println("Customer:" + customer);
            System.out.println("Amount:" + amount);
            customer.showInfo();
        }
    }

    public class Task6 {
        public static void main(String[] args) {

            Customer2 c = new Customer2("Arpitha", "arpitha@gmail.com");

            Order order = new Order(101,c,999.36);
            order.showOrderDetails();
        }
    }
