package java16;


public class PatternMatchingForInstanceOfExample {

    public static void main(String[] args) {
        Object object = "TEMPLER_ASSASSIN";

        checkInstanceOld(object);
        checkInstance(object);
    }

    private static void checkInstanceOld(Object object) {
        if(object instanceof String){
            String str = (String) object;
            System.out.println("The String is : "+ str);
        }
    }


    public static void checkInstance(Object object){
        if(object instanceof String) System.out.println("String is : "+ object);
    }
}


