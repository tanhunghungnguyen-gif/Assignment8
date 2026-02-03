package Lec7_String;

public class String_comparison_so_sanh_bang_bang {

    public static void main(String[] args) {
        String s1 = "Hello"; //s1 va s2 cung tham chieu chung 1 dia chi vi cung` 1 phuong thuc
        String s2 = "Hello";
        String s3 = new String("Hello"); // so sanh cung dia chi hay khong 
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
    
}
