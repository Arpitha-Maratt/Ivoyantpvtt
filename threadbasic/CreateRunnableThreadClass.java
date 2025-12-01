package threadbasic;

public class CreateRunnableThreadClass implements Runnable {
    public void run(){
        System.out.println("Runnable thread");
    }

    public static void main(String[] args) {
        CreateRunnableThreadClass obj = new CreateRunnableThreadClass();

        Thread t = new Thread(obj);
        t.start();
        System.out.println("Main thread");
    }
}

