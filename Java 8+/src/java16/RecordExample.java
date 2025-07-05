package java16;

public class RecordExample {
    public static void main(String[] args) {
        Point point = new Point(2,3);
        System.out.println("X is : "+ point.x());
        System.out.println("Y is : "+ point.y());
    }
}

record Point(int x, int y){}
