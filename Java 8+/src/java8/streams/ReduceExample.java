package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

    static void performMultiplication(List<Integer> input){

        Integer result = input.stream()
                .reduce(1,(a,b) -> a*b);
        System.out.println(result);
    }

    static Optional<?> performMultiplicationWithoutIdentity(List<Integer> input){

        return input.stream()
                .reduce((a,b) -> a*b);
    }

    static Optional<Student> getHighesGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((a,b) -> a.getGpa()> b.getGpa() ? a : b);
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();

        performMultiplication(input);

        Optional<Integer> result = (Optional<Integer>) performMultiplicationWithoutIdentity(input);

        if(result.isPresent()) System.out.println(result.get());
        else System.out.println("No result found");

        Optional<Student> topper = getHighesGpaStudent();

        System.out.println(topper.get());

    }

}
