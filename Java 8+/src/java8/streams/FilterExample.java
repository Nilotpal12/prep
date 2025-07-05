package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    static List<Student> getGoodFemaleStudents(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGender().equals("female"))
                .filter(s -> s.getGpa()>=4.0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        getGoodFemaleStudents().forEach(System.out::println);
    }
}
