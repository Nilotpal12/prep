package java8.streams;

import java8.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(s -> s.getGpa() >= 3.9);
    }

    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(s -> s.getGpa() >= 3.9);
    }

    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(s -> s.getGpa() >= 3.9);
    }

    public static void main(String[] args) {
        System.out.println("All Match: " + allMatch());
        System.out.println("Any Match: " + anyMatch());
        System.out.println("None Match: " + noneMatch());
    }
}
