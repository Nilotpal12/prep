package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

public class MapFilterReduceExample {

    private static int numberOfNotebooksforHighGrade(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGradeLevel()>=3)
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        int totalNotebooks = numberOfNotebooksforHighGrade();

        System.out.println("Total number of notebooks for students with grade level 3 or higher: " + totalNotebooks);
    }
}
