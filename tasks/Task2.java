package tasks;

/*3. Create Class: PremiumCustomer (extends Customer)
Add variable: rewardPoints
Override showInfo()
Add method: redeemPoints()*/

class Customer{
    public void showInfo(){
        System.out.println("Customer information");
    }
}
class PremiumCustomer extends Customer{
    int rewardPoints;

    @Override
    public void showInfo(){
        System.out.println("Reward points: " + rewardPoints);
    }

    public void redeemPoints(){
        System.out.println("Redeeming: "+ rewardPoints + "points");
        rewardPoints = 0;
    }
}
public class Task2 {
    public static void main(String[] args) {

        PremiumCustomer cust = new PremiumCustomer();
        cust.rewardPoints = 188;
        cust.showInfo();
        cust.redeemPoints();
        cust.showInfo();
    }
}