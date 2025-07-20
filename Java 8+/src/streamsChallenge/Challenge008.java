package streamsChallenge;

/*
Problem:
    Given a list of list of integers, flatten it into a single list using flatMap.

    Input: [[1,2], [3,4], [5]]
    Output: [1, 2, 3, 4, 5]
*/

import java.util.List;

public class Challenge008 {

    public static List<Integer> flattenList(List<List<Integer>> list){
        return list.stream()
                .flatMap(List::stream)
                .toList();
    }

    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5,6)
        );

    }
}
