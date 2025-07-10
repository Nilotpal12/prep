package revise.day01;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingAndReducing {

    public static Map<Integer,List<String>> groupByLength(List<String> list){
        return list.stream()
                .collect(Collectors.groupingBy(String::length));

    }

    public static Optional<String> joinedString(List<String> list){
        return list.stream()
                .reduce((a,b) -> a + "--" + b);
    }

    public static void main(String[] args) {
        List<String> list  = List.of("Alex", "Biswas", "Cindry", "Dominic", "Elon");

        Map<Integer,List<String>> map = groupByLength(list);

        map.forEach((length, names) -> {
            System.out.println("Length: " + length);
            names.forEach(name -> System.out.println("Name: " + name));
        });

        Optional<String> joined = joinedString(list);

        joined.ifPresent(System.out::println);

    }

}
