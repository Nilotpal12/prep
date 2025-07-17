package lld.oopConcept;

public class Abstraction {
    // Abstraction is a concept where we hide the complex implementation details and show only the essential features of an object.
    // It allows us to focus on what an object does instead of how it does it.

    // Example: Abstract class or interface can be used to achieve abstraction.
    // In Java, we can use abstract classes or interfaces to define abstract methods that must be implemented by subclasses.

    // Abstract class example
    abstract class Animal {
        abstract void sound();
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Bark");
        }
    }

    class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Meow");
        }
    }

    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        Animal dog = abstraction.new Dog();
        Animal cat = abstraction.new Cat();

        dog.sound(); // Output: Bark
        cat.sound(); // Output: Meow

        // Here, we are using abstraction to define the sound method without specifying how each animal makes its sound.
        // The implementation details are hidden, and we can focus on the behavior of the animals.

    }
}
