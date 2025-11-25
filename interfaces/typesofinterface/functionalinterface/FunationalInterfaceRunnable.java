package interfaces.typesofinterface.functionalinterface;

interface Runnable{
    public void run();
}
public class FunationalInterfaceRunnable implements Runnable {
    public void run(){
        System.out.println("Task is running");
    }

    public static void main(String[] args) {
        FunationalInterfaceRunnable t = new FunationalInterfaceRunnable();
        t.run();
    }
}
