package ThreadPool;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> 100 + 50;

        Future<Integer> result = executor.submit(task);

        System.out.println("Result = " + result.get());

        executor.shutdown();
    }
}
