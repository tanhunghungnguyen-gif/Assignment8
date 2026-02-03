package Lec9_InheritanceAndPolymorphism.MethodOverriding.Example1;

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }

}
