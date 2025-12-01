package threadbasic;

class EvenOdd {
    private int number = 1;
    private final int MAX =10;
    private boolean isOddTurn = true;

    public synchronized void printOdd(){
        while(number <= MAX){
            while (! isOddTurn){
                try {

                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Odd thread:"+number);
            number++;
            isOddTurn = false;
            notify();
        }
    }

    public synchronized void printEven(){
        while(number <=MAX){
            while (isOddTurn){
                try{
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Even thread:"+number);
            number++;
            isOddTurn=true;
            notify();
        }
    }
}
public class EvenOddPrinter{
    public static void main(String[] args) {
        EvenOdd printer = new EvenOdd();

        Thread oddThread = new Thread(()-> printer.printOdd());
        Thread evenThread = new Thread(()-> printer.printEven());

        oddThread.start();
        evenThread.start();
    }
}
