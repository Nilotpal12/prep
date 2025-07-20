package streamsChallenge;

/*
 Problem:
    Given a list of sentences, return a list of all unique words that have more than 3 characters.
 */

import java.util.Arrays;
import java.util.List;

public class Challenge009 {


    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Java is powerful",
                "Streams are elegant and concise",
                "Code with clarity"
        );

        List<String> result = extractWords(sentences);
        System.out.println(result);
    }

    private static List<String> extractWords(List<String> sentences) {
        return sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .filter(s -> s.length()>3)
                .toList();
    }
}
