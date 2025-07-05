package java8.methodReference;

import java8.data.Student;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<?> studentFetch = Student::new;
    static Function<Student,Student> studentGet = Student::new;

    public static void main(String[] args) {
        System.out.println(studentFetch.get());
        System.out.println(studentGet.apply(new Student("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"))));
    }
}
