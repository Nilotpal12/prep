package java8.functionalInterfaces;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> studentName = (s) -> System.out.print(s.getName());
    static Consumer<Student> studentActivities = (s) -> System.out.println(s.getActivities());
    static Consumer<Student> studentData= (s) -> System.out.println(s);

    public static void printStudents(){


        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentData);
    }

    public static void printStudentNameAndActivities(){


        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentName.andThen(studentActivities));
    }


    public static void printStudentWithConditions(){

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((
                student -> {
                    if(student.getGradeLevel()>=3){
                        studentName.andThen(studentActivities).accept(student);
                    }
                }));
    }

    public static void main(String[] args) {

        Consumer<String> c = (s) -> System.out.println(s.toUpperCase());

        c.accept("Java 8");
        //printStudents();
        //printStudentNameAndActivities();
        printStudentWithConditions();
    }
}
