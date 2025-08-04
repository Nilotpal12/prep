package streamsChallenge;

/*
    Given a sentence, return a map where the key is each unique word (in lowercase),
    and the value is how many times it appears.
 */

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge010 {

    public static void main(String[] args) {
        String sentence = "Hello world hello Java java world";

        // Convert the sentence to lowercase, split it into words, and count occurrences
        Map<String, Long> wordCountMap = getWordsCount(sentence);
        System.out.println("Word Count Map: " + wordCountMap);
    }

    private static Map<String, Long> getWordsCount(String sentence) {
        return Arrays.stream(sentence.toLowerCase()
                .replaceAll("[^a-zA-Z ]","")
                .split("\\s+"))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));


    }


}
