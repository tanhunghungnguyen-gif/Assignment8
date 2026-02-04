package Lec11_Encapsulation.staticKeyword.ExOfStaticMethod;

public class Student {

    String name;
    int rollno;
    static String collage = "DTU";

    static void Change() {
        collage = "BBDIT";
    }

    Student(int r, String n) {

        name = n;
        rollno = r;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + collage);

    }

    public static void main(String[] args) {
        Student.Change();

        Student s1 = new Student(111, "Trang");
        Student s2 = new Student(222, "Duong");

        s1.display();
        s2.display();
    }
}
