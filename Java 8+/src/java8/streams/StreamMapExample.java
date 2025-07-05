package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamMapExample {

    static List<String> getNames(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(toList());
    }

    static Set<String> getNamesSet(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toSet());
    }

    public static void main(String[] args) {
        getNames().forEach(System.out::println);
    }
}
