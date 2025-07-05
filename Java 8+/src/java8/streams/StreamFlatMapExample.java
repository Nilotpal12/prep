package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamFlatMapExample {

    static List<String> getActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toList());
    }

    static List<String> getDistinctActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
    }

    public static void main(String[] args) {
        getDistinctActivities().forEach(System.out::println);
    }
}
