package java8.functionalInterfaces;

import java8.data.Student;
import java8. data.StudentDataBase;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){

        BiConsumer<String,String> biConsumer = (name, activities) -> System.out.println(name + ": "+activities);

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities().toString()));
    }

    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b) -> {
            System.out.println("a: "+a+" b: "+b);
        };

        biConsumer.accept("Java7", "Java8");

        BiConsumer<Integer,Integer> multiply = (a,b) -> {
            System.out.println("Multiplication:"+ (a*b));
        };

        BiConsumer<Integer,Integer> division = (a,b) -> {
            System.out.println("Addition:"+ (a/b));
        };

        multiply.andThen(division).accept(10,5);

        nameAndActivities();
    }
}
