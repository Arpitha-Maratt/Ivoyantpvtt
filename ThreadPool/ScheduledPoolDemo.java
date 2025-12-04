package ThreadPool;

import java.util.concurrent.*;

public class ScheduledPoolDemo {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(2);

        scheduler.schedule(() ->
                        System.out.println("Delayed Task executed"), 3,
                TimeUnit.SECONDS);

        scheduler.shutdown();
    }
}

