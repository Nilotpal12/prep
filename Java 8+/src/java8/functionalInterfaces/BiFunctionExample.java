package java8.functionalInterfaces;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static Predicate<Student> predicate = student -> student.getGpa()>=3;

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> function = (s, p) -> {
        Map<String, Double> map = new HashMap<>();
        s.forEach((student) -> {
            if (p.test(student)) {
                map.put(student.getName(), student.getGpa());
            }
        });
        return map;
    };

    public static void main(String[] args) {
        System.out.println(function.apply(StudentDataBase.getAllStudents(), predicate));
    }


}
