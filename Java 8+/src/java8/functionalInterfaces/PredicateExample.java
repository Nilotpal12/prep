package java8.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicate = i -> i%2==0;
    static Predicate<Integer> predicateB = i -> i%5==0;

    public static void andPredicate(Integer integer){
        System.out.println(predicate.and(predicateB).test(integer));
    }

    public static void orPredicate(Integer integer){
        System.out.println(predicate.or(predicateB).test(integer));
    }

    public static void negatePredicate(Integer integer){
        System.out.println(predicate.or(predicateB).negate().test(integer));
    }

    public static void main(String[] args) {

        System.out.println(predicate.test(2));
        System.out.println(predicateB.test(6));

        andPredicate(10);
        orPredicate(10);
        negatePredicate(10);
    }
}
