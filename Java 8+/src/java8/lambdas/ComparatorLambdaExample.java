package java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }

        };

        System.out.println("Result of Comparator: " + comparator.compare(3, 4));

        Comparator<Integer> comparatorLambda = (Integer o1, Integer o2) -> o1.compareTo(o2);

        System.out.println("Result of Comparator Lambda: " + comparatorLambda.compare(3, 1));

        Comparator<Integer> comparatorLambdaFine = (o1, o2) -> o1.compareTo(o2);

        System.out.println("Result of Comparator Lambda Fine: " + comparatorLambdaFine.compare(3, 3));


    }
}
