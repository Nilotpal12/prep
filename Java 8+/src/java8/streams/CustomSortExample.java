package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CustomSortExample {

    static List<Student> sortByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    static List<Student> sortByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }



    public static void main(String[] args) {
        sortByName().forEach(System.out::println);
        System.out.println("===================================");
        sortByGpa().forEach(System.out::println);

    }
}
