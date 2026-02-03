package Lec8_ObjectAndClass.Constructor.ParameterizedContructor;

public class Student {

    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void hienthi() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(111, "Hung");  
        Student s2 = new Student(222, "Hung");
        s1.hienthi();
        s2.hienthi();
    }

}
