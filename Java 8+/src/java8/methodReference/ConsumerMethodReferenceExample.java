package java8.methodReference;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<String> consumer = System.out::println;
    static Consumer<Student> studentConsumer = Student::printActivities;


    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(studentConsumer);
        consumer.accept("Print it");

    }
}
