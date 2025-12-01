package thread;


class MyThread implements Runnable{
    public void run(){
        System.out.println("Runnable thread:");
    }
}
public class CreateRunnableThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread thread = new Thread(myThread);
        thread.start();
    }
}
