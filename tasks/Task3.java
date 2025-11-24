package tasks;

/*2. Create Class: Customer (extends User)
Add variable: customerId
Constructor must call super()
Override showInfo()
Add method: placeOrder()*/
class User1{

    String name;
    String email;

    public User1(){
        System.out.println("User constructor called");
    }
    public void showInfo(){
        System.out.println("Name : "+name);
        System.out.println("Email"+email);
    }
}

class Customers extends User1{
    int customerId;

    public Customers(int customerId, String name,String email){
        super();
        this.customerId=customerId;
        this.name=name;
        this.email=email;
    }

    @Override
    public void showInfo(){
        System.out.println("Customer id: "+ customerId);
        System.out.println("Name: "+ name);
        System.out.println("Email: "+ email);
    }
    public void placeholder(){
        System.out.println("Order placed successfully for customer Id:"+ customerId);
    }
}
public class Task3 {
    public static void main(String[] args) {
        Customers c1 = new Customers(101, "Arpitha","arpitha@gmail.com");
        c1.showInfo();
        c1.placeholder();
    }
}
