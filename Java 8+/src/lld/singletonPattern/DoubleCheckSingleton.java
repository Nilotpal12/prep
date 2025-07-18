package lld.singletonPattern;

public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleCheckSingleton.class){
                if(instance==null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
