package revise.day01;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsBasic {

    public static void names(List<String> list) {
        list.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);
    }

    public static void makeAllCaps(List<String> list){
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static List<String> giveNamesList(List<String> list){
        return list.stream().collect(toList());
    }

    public static void main(String[] args) {
        List<String> list = List.of("Alex", "Biswas", "Cindry", "Dominic", "Elon");

        names(list);
        makeAllCaps(list);
        List<String> listFinal = giveNamesList(list);
        listFinal.forEach(System.out::println);
    }
}
