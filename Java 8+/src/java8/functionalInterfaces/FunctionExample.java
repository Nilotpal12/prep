package java8.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> upperFunction = (s) -> s.toUpperCase();
    static Function<String,String> append = s -> s.concat("-java8");
    static Function<String,String> test = s -> s.concat("-test");

    public static void main(String[] args) {

        String input = "pokemon";

        System.out.println(upperFunction.andThen(append).apply(input));
        System.out.println(upperFunction.compose(append).apply(input));
        System.out.println(append.apply(input));
        System.out.println(append.andThen(upperFunction).apply(input));

        System.out.println(upperFunction.compose(test).andThen(append).apply(input));

    }
}
