package threadbasic;

class MyThreads extends Thread{

    public void run(){
        System.out.println("It is my first thread");
    }
}

public class CreateThreadByextendingThread {
    public static void main(String[] args) {
        MyThreads t = new MyThreads();
        t.start();
        System.out.println("Main thread is running");
        t.run();
    }
}
