package lld.singletonPattern;

public enum EnumBasedSingleton {

    INSTANCE;

    public void method(){
        System.out.println("Enum Based Singleton Function Called");
    }

}
