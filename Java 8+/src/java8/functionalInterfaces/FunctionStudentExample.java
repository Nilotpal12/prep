package java8.functionalInterfaces;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {


    static Function<List<Student>, Map<String,Double>> mapStudents = (list) -> {

        Map<String,Double> map = new HashMap<>();
        list.forEach(student -> map.put(student.getName(),student.getGpa()));
        return map;
    };

    public static void main(String[] args) {
        System.out.println(mapStudents.apply(StudentDataBase.getAllStudents()));
    }
}
