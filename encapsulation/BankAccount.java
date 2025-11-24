package encapsulation;


public class BankAccount {
    private double balance;

    public  BankAccount(double initialBalance){
        if(initialBalance >= 0){
            this.balance=initialBalance;
        }else{
            System.out.println("Invalid initial balance.Setting balance to 0");
            this.balance=0;
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance +=amount;
            System.out.println("Deposited : " + amount);
        }else{
            System.out.println("Invalid deposit aount:"+amount);
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -=amount;
            System.out.println("Withdraw" +
                    ":"+amount);
        }else{
            System.out.println("Invalid withdrawl amount :"+amount);
        }
    }

    public  double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        System.out.println("Initail balanace: "+account.getBalance());

        account.deposit(500);
        System.out.println("Balance after deposit: "+ account.getBalance());

        account.withdraw(300);
        System.out.println("Balance After withdrawing: "+ account.getBalance());

        account.withdraw(2000);
        System.out.println("Final balance : "+ account.getBalance());
    }
}
