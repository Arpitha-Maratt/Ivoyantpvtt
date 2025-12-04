package methods;

import java.util.concurrent.*;

public class TimeoutDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(() -> {
            Thread.sleep(5000); // Simulating long task
            return "Task Completed!";
        });

        try {
            System.out.println(future.get(2, TimeUnit.SECONDS));
        } catch (TimeoutException e) {
            System.out.println("Task timed out!");
            future.cancel(true); // Cancel if it takes too long
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("The task is cancelled"+future.isCancelled());
        System.out.println( "The task is done"+future.isDone());

        executor.shutdown();
    }
}
