package tasks;

/*7. Demonstrate Runtime Polymorphism
Create User references holding:
Customer object
PremiumCustomer object
Seller object
Call showInfo() on each*/

class User2{
    public void showInfo(){
        System.out.println("Iser info");
    }
}

class Customer3 extends User2{
    @Override
    public void showInfo(){
        System.out.println("Customer info");
    }
}

class PremiumCustomer1 extends User2{
    @Override
    public void showInfo(){
        System.out.println("Premium cutsomer info");
    }
}
class Seller1 extends User2 {
    @Override
    public void showInfo() {
        System.out.println("Seller Info");
    }
}
public class Task7 {
    public static void main(String[] args) {
        User2 u1 = new Customer3();          // Parent reference → Customer object
        User2 u2 = new PremiumCustomer1();   // Parent reference → PremiumCustomer object
        User2 u3 = new Seller1();            // Parent reference → Seller object

        u1.showInfo();   // Customer Info
        u2.showInfo();   // Premium Customer Info
        u3.showInfo();
    }
}
