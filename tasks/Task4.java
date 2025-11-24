package tasks;

class Users{

    public void showInfo(){
        System.out.println("User information");
    }
}

class Seller extends Users{
    int sellerId;

    public Seller(int sellerId){
        this.sellerId=sellerId;
    }

    @Override
    public void showInfo(){
        System.out.println("Seller ID:"+sellerId);

    }


    public void addProduct(){
        System.out.println("Product added by seller ID "+ sellerId);
    }
}

public class Task4 {
    public static void main(String[] args) {
        Seller sel = new Seller(101);
        sel.showInfo();
        sel.addProduct();

    }
}
