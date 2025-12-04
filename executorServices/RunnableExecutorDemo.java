package executorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : Task is running");
    }
}

public class RunnableExecutorDemo {
    public static void main(String[] args) {

        // Creating a thread pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submitting tasks for execution
        for(int i = 1; i <= 5; i++) {
            executor.submit(new MyTask());
        }

        // Shutdown after tasks
        executor.shutdown();
    }
}
