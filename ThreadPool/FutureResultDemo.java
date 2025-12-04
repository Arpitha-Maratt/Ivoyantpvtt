package ThreadPool;

import java.util.concurrent.*;

class SumTask implements Callable<Integer> {
    private int a, b;

    public SumTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() {
        return a + b;  // Returning result
    }
}

public class FutureResultDemo {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new SumTask(10, 20));

        Integer result = future.get(); // Getting result
        System.out.println("Sum: " + result);

        executor.shutdown();
    }
}

