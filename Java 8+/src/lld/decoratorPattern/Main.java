package lld.decoratorPattern;

public class Main {

    public static void main(String[] args) {

        Notifier notifier = new SlackNotifier(new SMSNotifier(new EmailNotifier()));

        notifier.send("UFO incoming");

    }
}
