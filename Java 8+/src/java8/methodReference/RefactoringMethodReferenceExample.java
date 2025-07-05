package java8.methodReference;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactoringMethodReferenceExample {

    static Predicate<Student> predicate = RefactoringMethodReferenceExample::isGoodGrade;

    static boolean isGoodGrade(Student s){
        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {

        Student student = StudentDataBase.studentSupplier.get();

        System.out.println(predicate.test(student));

    }

}
