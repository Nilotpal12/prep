package java8.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        Runnable runnable = new Runnable(){

            @Override
            public void run() {
                System.out.println("Hello from a thread!");
            }
        };

        new Thread(runnable).start();

        Runnable lamddaRunnable = () -> System.out.println("Hello from a lambda thread!");

        new Thread(lamddaRunnable).start();

        new Thread(() -> System.out.println("Hello from a lambda directly from thread!")).start();
    }
}
