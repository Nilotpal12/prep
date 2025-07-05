package java8.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unary = s -> s.concat("-java8");

    public static void main(String[] args) {
        String input = "is it";

        System.out.println(unary.apply(input));
    }
}
