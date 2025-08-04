package threadsPractice;

/*
    Fixed Thread Pool with 5 Runnable Tasks
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threading001 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0;i<5;i++){
            final int id = i;

            executorService.submit(() ->
                    System.out.println("Task id :: "+id+" on thread:: "+Thread.currentThread().getName())
            );
        }

        executorService.shutdown();

    }

}
