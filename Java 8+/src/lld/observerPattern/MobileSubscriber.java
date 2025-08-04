package lld.observerPattern;

public class MobileSubscriber implements Observer{

    public String name;

    public MobileSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification :: "+ message);
    }
}
