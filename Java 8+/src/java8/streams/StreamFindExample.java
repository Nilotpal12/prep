package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.Optional;

public class StreamFindExample {

    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGpa() >= 4.1)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> studentOptional = findAny();
        if (studentOptional.isPresent()) {
            System.out.println("Found Student: " + studentOptional.get());
        } else {
            System.out.println("No student found with GPA >= 3.9");
        }

        Optional<Student> optionalStudent = findFirst();

        if (optionalStudent.isPresent()){
            System.out.println("First Student with GPA >= 3.9: " + optionalStudent.get());
        } else {
            System.out.println("No student found with GPA >= 4.1");
        }
    }
}
