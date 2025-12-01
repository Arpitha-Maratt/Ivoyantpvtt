package threadbasic;

class HelloHi {
    private boolean helloTurn = true;

    public synchronized void hello() throws InterruptedException {
        for(int i = 0; i < 5; i++) {
            while (!helloTurn) {
                wait();
            }
            System.out.println("Hello");
            helloTurn = false;
            notify();
        }
    }

    public synchronized void hi() throws InterruptedException {
        for(int i = 0; i < 5; i++) {
            while (helloTurn) {
                wait();
            }
            System.out.println("Hi");
            helloTurn = true;
            notify();
        }
    }
}

public class HiHello {
    public static void main(String[] args) {
        HelloHi obj = new HelloHi();

        Thread t1 = new Thread(() -> {
            try { obj.hello(); }
            catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try { obj.hi(); }
            catch (InterruptedException e) {}
        });

        t1.start();
        t2.start();
    }
}

