package lld.decoratorPattern;

public class SMSNotifier extends NotifierDecorator{


    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message){

        super.send(message);
        System.out.println("Notification Sent through SMS:: "+ message);
    }
}
