package java8.functionalInterfaces;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<List<Student>> studentSupplier = () -> StudentDataBase.getAllStudents();

    public static void main(String[] args) {

        System.out.println(studentSupplier.get());
    }
}
