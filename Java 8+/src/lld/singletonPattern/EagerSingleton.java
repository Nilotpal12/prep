package lld.singletonPattern;

public class EagerSingleton {

    public static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void sample(){
        System.out.println("Eager Singleton Sample Method");
    }

}
