package thread;


class Threads extends Thread{
    public void run(){
        System.out.println("Thread is rinning");
    }
}
public class CreateThreadClass {
    public static void main(String[] args) {
        Threads threads = new Threads();
        threads.start();
    }
}
