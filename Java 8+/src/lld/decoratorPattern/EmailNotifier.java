package lld.decoratorPattern;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Notification Sent through Email:: "+ message);
    }
}
