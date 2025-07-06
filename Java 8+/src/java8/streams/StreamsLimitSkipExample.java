package java8.streams;

import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limitSum(List<Integer> list){
        return list.stream()
                .limit(2)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skipSum(List<Integer> list){
        return list.stream()
                .skip(2)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> limitResult = limitSum(list);
        Optional<Integer> skipResult = skipSum(list);

        if (limitResult.isPresent()) {
            System.out.println("Limit Sum: " + limitResult.get());
        } else {
            System.out.println("No result found for limit sum");
        }

        if (skipResult.isPresent()) {
            System.out.println("Skip Sum: " + skipResult.get());
        } else {
            System.out.println("No result found for skip sum");
        }
    }
}
