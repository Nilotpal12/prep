package streamsChallenge;

/*
    Given a list of names, return a Map<Character, List<String>> where the key is the first character of each name (uppercase),
    and the value is the list of names that start with that letter.

    Example Input:
    ["Alice", "Bob", "alex", "Brandon", "Ankit"]
*/

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Challenge003 {

    public static Map<Character, List<String>> groupingByFirstCharacter(List<String> list) {
        return list.stream()
                .collect(groupingBy(e ->e.toUpperCase().charAt(0)));
    }

    public static void main(String[] args) {
        List<String> list = List.of("Alice", "Bob", "alex", "Brandon", "Ankit");
        Map<Character, List<String>> result = groupingByFirstCharacter(list);

        System.out.println(result.toString());

    }
}
