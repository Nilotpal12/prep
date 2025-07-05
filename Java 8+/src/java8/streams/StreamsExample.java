package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static Predicate<Student> grade = s -> s.getGradeLevel()>=3;
    static Predicate<Student> gpa = s -> s.getGpa()>=3.9;

    public static void main(String[] args) {


        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(System.out::println).filter(grade).peek(s -> System.out.println("Filtered by grade: " + s))
                .filter(gpa).peek(s -> System.out.println("Filtered by gpa: " + s))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
    }
}
