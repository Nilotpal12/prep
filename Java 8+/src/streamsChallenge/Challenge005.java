package streamsChallenge;

/*
    Problem:
    Given a list of integers, return a list containing the square of all odd numbers.
    Input: [1, 2, 3, 4, 5]
    Output: [1, 9, 25]
 */

import java.util.List;

public class Challenge005 {

    public static List<Integer> getOddSquare(List<Integer> list){
        return list.stream()
                .filter(i -> i%2!=0)
                .map(i -> i*i)
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> oddSquares = getOddSquare(list);
        System.out.println(oddSquares); // Output: [1, 9, 25]

    }
}
