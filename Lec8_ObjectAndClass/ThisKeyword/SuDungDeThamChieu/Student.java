package Lec8_ObjectAndClass.ThisKeyword.SuDungDeThamChieu;

public class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;    //Dung This boi vi bien cuc bo ID giong nhau voi bien tham chieu ID
        this.name = name;
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
