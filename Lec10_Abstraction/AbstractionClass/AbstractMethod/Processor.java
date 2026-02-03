package Lec10_Abstraction.AbstractionClass.AbstractMethod;

public class Processor {

    public static void main(String[] args) {
        Square square = new Square(3);
        System.out.println("Area of the shape : " + square.calculateArea());
    }
}
