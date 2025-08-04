package threads;

import java.util.List;
import java.util.concurrent.*;

public class CallableThreadPoolExample {

    public static void main(String[] args) {

        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<List<String>>  fs = null;

        for(int i=0; i<4; i++){

            int id = i;

            Callable<List<String>> task = () -> {
                Thread.sleep(1000);
                return List.of("Running :: " + Thread.currentThread().getName()
                        + " with Id::"+  id + " with State: " + Thread.currentThread().getState());
            };

            
             fs = executorService.submit(task);

            System.out.println("Waiting for result from thread: " + Thread.currentThread().getName());

            try {
                System.out.println(fs.get(2, TimeUnit.SECONDS));
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                throw new RuntimeException(e);
            }

        }
        executorService.shutdown();


    }
}
