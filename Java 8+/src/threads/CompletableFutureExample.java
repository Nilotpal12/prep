package threads;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() ->
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Running :: " + Thread.currentThread().getName());
            return "Hello from CompletableFuture!";
        });

        System.out.println("MainStrategy thread doing some work...");
        String value = future.join();
        System.out.println("Result from CompletableFuture: " + value);


        CompletableFuture.supplyAsync(() -> "Waow").thenApply(String::toLowerCase).thenAccept(System.out::println);



    }
}
