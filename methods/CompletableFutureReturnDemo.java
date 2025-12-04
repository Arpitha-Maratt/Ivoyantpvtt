package methods;

import java.util.concurrent.*;

public class CompletableFutureReturnDemo {
    public static void main(String[] args) throws Exception {

        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> 10 + 20);

        System.out.println("Result: " + future.get());


        CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(str -> str + " World")
                .thenAccept(System.out::println);


    }
}
