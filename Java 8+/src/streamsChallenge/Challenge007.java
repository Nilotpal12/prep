package streamsChallenge;

/*
    Given a list of strings, return a Map<String, Long> where the key is the string and value is its count.

    Input: ["apple", "banana", "apple"]
    Output: {"apple"=2, "banana"=1}
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge007 {

    public static Map<String, Long> countOccurancex(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    }
    public static void main(String[] args) {

        List<String> list = List.of("apple", "banana", "apple");
        Map<String, Long> result = countOccurancex(list);
        System.out.println(result); // Output: {apple=2, banana=1}
    }
}
