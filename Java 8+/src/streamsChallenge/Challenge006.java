package streamsChallenge;
/*
    Problem:
    Given a list of strings, return a single string joined by comma.

    Input: ["apple", "banana", "grape"]
    Output: "apple,banana,grape"
*/

import java.util.List;

public class Challenge006 {

    public static String listToString(List<String> list) {
        return list.stream()
                .reduce((s1, s2) -> s1 + "," + s2)
                .orElse("");
    }


    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "grape");
        String result = listToString(list);

        System.out.println(result);

    }
}
