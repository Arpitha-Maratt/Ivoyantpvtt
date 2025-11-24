package tasks;
/*5. Create Interfaces (Multiple Inheritance)
interface PaymentService { void processPayment(double amount); }
interface NotificationService { void sendNotification(String msg); }
Make Customer implement both interfaces*/


interface  PaymentService{
    void processPayment(double amount);
}
interface NotificationService{
    void sendNotification(String msg);
}

class Customerr implements PaymentService,NotificationService{

    @Override
    public void processPayment(double amount){
        System.out.println("Processing payment of ₹" + amount);
    }

    @Override
    public void sendNotification(String msg) {
        System.out.println("Notification: " + msg);
    }

}
public class Task5 {
    public static void main(String[] args) {
         Customerr c = new Customerr();
         c.processPayment(99.98);
         c.sendNotification("Your payment is successfull");
    }
}
