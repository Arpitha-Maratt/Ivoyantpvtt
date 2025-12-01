package threadbasic;

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class ThreadImplementUsingRunnable {
    public static void main(String[] args) {

        //creating a runnable object

        MyRunnable myRunnable = new MyRunnable();

        //create new thread and passing runnable object
        Thread myThread = new Thread(myRunnable);

        //start a new thread
        myThread.start();

        //main thrreads continusly run

        System.out.println("Main thread is running");
    }
}
