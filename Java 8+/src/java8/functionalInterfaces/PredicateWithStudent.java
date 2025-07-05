package java8.functionalInterfaces;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateWithStudent {

    static Predicate<Student> predicateGpa = student -> student.getGpa()>=3.5;
    static Predicate<Student> predicateGrade = student -> student.getGradeLevel()>=3;

    static void filterBrightStudent(){
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if(predicateGpa.and(predicateGrade).test(student)){
                System.out.println(student.toString());
            }
        });
    }

    public static void main(String[] args) {
        filterBrightStudent();
    }
}
