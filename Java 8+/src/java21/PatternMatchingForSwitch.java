package java21;

public class PatternMatchingForSwitch {

    public static void main(String[] args) {

        Object object = 1021;

        traditionalCondition(object);
        patternMatchingSwitch(object);


    }

    public static void traditionalCondition(Object object){
        if(object instanceof String) System.out.println("String is : "+ object);
        else if (object instanceof Integer) System.out.println("Integer is : "+ object);
        else if (object instanceof Boolean) System.out.println("Boolean is : "+ object);
        else System.out.println("Unknown type");
    }

    public static void patternMatchingSwitch(Object object){
        switch (object){
            case Integer i when i>1000 -> System.out.println("Huge Integer : "+ i);
            case Integer i -> System.out.println("Integer is : "+ i);
            case String s -> System.out.println("String is : "+ s);
            case Boolean b -> System.out.println("Boolean is : "+ b);
            default -> System.out.println("Unknown type");
        }
    }
}
