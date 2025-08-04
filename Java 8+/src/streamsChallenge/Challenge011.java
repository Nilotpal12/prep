package streamsChallenge;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
    Given a list of strings, return the top 3 longest strings in descending order of length.
    📥 Input:
    List<String> input = List.of("apple", "banana", "cherry", "fig", "grapefruit", "kiwi");
    🎯 Expected Output:
    ["grapefruit", "banana", "cherry"]
 */
public class Challenge011 {

    public static void main(String[] args) {
        List<String> input = List.of("apple", "banana", "cherry", "fig", "grapefruit", "kiwi");

        List<String> top3LongestStrings = top3LongestStrings(input);

        System.out.println(top3LongestStrings); // Output: ["grapefruit", "banana", "cherry"]
    }

    private static List<String> top3LongestStrings(List<String> input) {
        return input.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .distinct()
                .limit(3)
                .toList();
    }
}
