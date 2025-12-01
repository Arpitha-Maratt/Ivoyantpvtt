package threadbasic;

class RunnableNumber implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }

    public static void main(String[] args) {
        RunnableNumber obj = new RunnableNumber();     // Create Runnable object
        Thread t = new Thread(obj);            // Pass it to Thread class
        t.start();                             // Start new thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
