package revise.day01;

public class LambasAndFunctionalInterface {
    // Functional interface with a single abstract method
    @FunctionalInterface
    interface MyFunctionalInterface {
        void execute(String message);
    }

    public static void main(String[] args) {

        MyFunctionalInterface myFunction = s -> System.out.println("String message: "+ s);

        // Using the functional interface
        myFunction.execute("Hello, this is a functional interface example!");

        Runnable runnable =  new Runnable() {
            @Override
            public void run(){
                System.out.println("Running a thread using Runnable interface");
            }
        };

        Runnable runnableAnother = () -> System.out.println("Running another thread using Lambda expression ");

        // Using the Runnable interface
        Thread.startVirtualThread(runnable);
        Thread.ofVirtual().start(runnableAnother);

    }
}
