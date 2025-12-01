package threadbasic;

public class AlternatingThread implements Runnable {
    private final Object lock;
    private boolean mainTurn = true;

    public AlternatingThread(Object lock) {
        this.lock = lock;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (lock) {
                while (mainTurn) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Runnable thread:" + i);
                mainTurn = true;
                lock.notify();
            }
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();
        AlternatingThread obj = new AlternatingThread(lock);
        Thread t = new Thread(obj);
        t.start();

        for (int i = 1; i <= 5; i++) {
            synchronized (lock) {
                while (!obj.mainTurn) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Main thread:" + i);
                obj.mainTurn = false;
                lock.notify();

            }

        }
    }
}
