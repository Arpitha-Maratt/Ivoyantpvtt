package methods;

import java.util.concurrent.*;
class MyTask implements Callable<Integer> {
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return 50;
    }
}

public class GetAndIsDoneMethodUsage {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new MyTask());

        System.out.println("Task submitted...");

        while (!future.isDone()) {
            System.out.println("Task still running...");
            Thread.sleep(500);
        }

        System.out.println("Result: " + future.get());
        executor.shutdown();
    }
}
