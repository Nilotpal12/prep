package streamsChallenge;

import java.util.List;

/*
    Problem:
    You have a list of integers. Return a new list that contains only even numbers, each doubled.

    Example Input:
    [1, 2, 3, 4, 5, 6]
    Output:
    [4, 8, 12]
*/

public class Challenge001 {

    public static List<Integer> filterEvenNumbers(List<Integer> list){
        return list.stream()
                .filter(x -> x%2==0)
                .map(x -> x*2)
                .toList();
    }


    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> result = filterEvenNumbers(list);
    }
}
