package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static Optional<Integer> getMax(List<Integer> list){
        return list.stream()
                .reduce(Integer::max);
    }

    public static Optional<Integer> getMin(List<Integer> list){
        return list.stream()
                .reduce(Integer::min);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,8,9,10,11,12,13,14,15);

        if(getMax(list).isPresent()){
            System.out.println("Max: " + getMax(list).get());
        } else {
            System.out.println("No max value found");
        }

        if(getMin(list).isPresent()){
            System.out.println("Min: " + getMin(list).get());
        } else {
            System.out.println("No min value found");
        }

    }
}
