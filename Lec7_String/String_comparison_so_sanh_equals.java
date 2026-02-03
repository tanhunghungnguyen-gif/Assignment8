package Lec7_String;

public class String_comparison_so_sanh_equals {

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = new String("Hello World");
        String s4 = "HELLO World";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4)); // bo qua viet hoa
    }

}
