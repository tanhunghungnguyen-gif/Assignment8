package Lec8_ObjectAndClass.Constructor.DefaultConstructor;

public class Student {

    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();// co the gan gia tri sau khi tao
        s1.id = 1;
        s1.name = "Hung";
        Student s2 = new Student();
        s1.display();
        s2.display();
    }

}
