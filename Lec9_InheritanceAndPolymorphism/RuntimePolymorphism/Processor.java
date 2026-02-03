package Lec9_InheritanceAndPolymorphism.RuntimePolymorphism;

public class Processor {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
    }

}
