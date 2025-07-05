package java8.functionalInterfaces;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateWithConsumerExample {

    Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.5;
    Predicate<Student> gradePredicate = student -> student.getGradeLevel()>=3;

    BiConsumer<String, List<?>> biConsumer = (name, activities) -> System.out.println(name + " is enrolled in " + activities);

    Consumer<Student> consumer = student -> {
        if(gpaPredicate.and(gradePredicate).test(student)){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printTopStudents(List<Student> students){
        students.forEach(consumer);
    }

    public static void main(String[] args) {

        PredicateWithConsumerExample thisClass = new PredicateWithConsumerExample();

        List<Student> students = StudentDataBase.getAllStudents();
        thisClass.printTopStudents(students);

    }
}
