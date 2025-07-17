package lld.oopConcept;

public class Polymorphism {

    class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Cat extends Animal{
        public void sound() {
            System.out.println("Cat meows");
        }
    }

    class Cow extends Animal{
        public void sound() {
            System.out.println("Cow moos");
        }
    }

    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        Animal myAnimal = polymorphism.new Animal(); // Animal reference and object
        Animal myCat = polymorphism.new Cat(); // Animal reference but Cat object
        Animal myCow = polymorphism.new Cow(); // Animal reference but Cow object

        myAnimal.sound(); // Outputs: Animal makes a sound
        myCat.sound();    // Outputs: Cat meows
        myCow.sound();    // Outputs: Cow moos
    }
}
