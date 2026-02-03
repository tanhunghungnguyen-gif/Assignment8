package Lec10_Abstraction.AbstractionClass.All;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void HienThiTen() {
        System.out.println("Name : " + name);
    }

    public abstract void makeSound();
}
