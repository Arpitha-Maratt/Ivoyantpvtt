package executorServices;

import java.util.concurrent.*;

class SumTask implements Callable<Integer> {
    private int a, b;

    public SumTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() {
        return a + b;  // Task returns a value
    }
}

public class CallableExecutorDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> result = executor.submit(new SumTask(10, 20));

        try {
            System.out.println("Sum = " + result.get()); // Fetching result
        }
        catch (Exception e) {
            System.out.println(e);
        }

        executor.shutdown();
    }
}
