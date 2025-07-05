package java16;

public class SealedClassesExample {
    public static void main(String[] args) {

    }
}

sealed interface Shape permits Circle, Rectangle, Square, Pentagon, Octagon{}

final class Circle implements Shape{}
final class Square implements Shape{}
final class Rectangle implements Shape{}

record Pentagon() implements Shape{}
non-sealed class Octagon implements Shape{}
