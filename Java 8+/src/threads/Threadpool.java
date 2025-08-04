package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool {


    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> System.out.println("Running :: "+ Thread.currentThread().getName()));

        executor.shutdown();
    }
}
