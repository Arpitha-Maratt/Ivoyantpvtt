package threadbasic;

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running:");
    }
}
public class ThreadCreateUsingThreadClass {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Main thread is running");
    }
}
