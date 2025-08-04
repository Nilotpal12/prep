package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableThreadPoolExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0; i<8; i++){

            int Id = i;

            executorService.submit(() -> {
                System.out.println("Running :: " + Thread.currentThread().getName()+" with Id: " + Id);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            });


        }
        executorService.shutdown();
    }
}
