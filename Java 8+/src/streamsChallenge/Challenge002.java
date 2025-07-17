package streamsChallenge;


/*
    Problem:
    You have a list of strings. Return a new list that contains only the strings that start with the letter 'a',
    converted to uppercase.

    Example Input:
    ["apple", "banana", "avocado", "grape"]
    Output:
    ["APPLE", "AVOCADO"]
 */

import java.util.List;

public class Challenge002 {

    public static List<String> filterAndUpperCase(List<String> list){
        return list.stream()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .map(String::toUpperCase)
                .toList();
    }


    public static void main(String[] args) {

        List<String> list = List.of("apple", "banana", "avocado", "grape");

    }
}
