package Lec8_ObjectAndClass.MethodOverloading.ThayDoiThuTu;

public class OverloadingExample3 {
    public static void ThongTinIn(String name , int age){
        System.out.println("Name: "+name+", Age: "+age);
    }
    public static void ThongTinIn(int age,String name){
        System.out.println("Age: "+age+" ,Name: "+name);
    }
    
}
