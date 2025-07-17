package streamsChallenge;

/*Task 4: Advanced Stream Mapping
    Problem:
    Given a list of integers, return a Map<Boolean, List<Integer>> that groups the numbers into even and odd buckets.

    Example Input:
    [1, 2, 3, 4, 5, 6]
    Output:
    {
        false=[2, 4, 6],
        true=[1, 3, 5]
    }
 */

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge004 {

    public static Map<Boolean, List<Integer>> groupByOddEven(List<Integer> list){
        return list.stream()
                .collect(Collectors.partitioningBy(i -> i%2==0));
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> result = groupByOddEven(list);
        System.out.println(result);

    }
}
