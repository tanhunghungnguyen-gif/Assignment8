package Lec8_ObjectAndClass.ThisKeyword.GoiHamTaoLopHienTai;

public class Student {

    int id;
    String name;

    Student() {
        System.out.println("default constructor is invoked");
    }

    Student(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void hienthi() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student e1 = new Student(111, "Hung");
        Student e2 = new Student(222, "Hung");
        e1.hienthi();
        e2.hienthi();
    }

}
