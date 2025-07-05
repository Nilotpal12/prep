package java8.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> upperCase = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(upperCase.apply("java-8"));
    }
}
