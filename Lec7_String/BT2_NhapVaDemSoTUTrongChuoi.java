package Lec7_String;

import java.util.*;

public class BT2_NhapVaDemSoTUTrongChuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi : ");

        String s = sc.nextLine();

        s = s.trim();
        //loai bo khoang trang dau va cuoi cua chuoi
        if (s.isEmpty()) {
            System.out.print("So tu : 0");
        } else {
            String[] sotu = s.split("\\s+");
            //tach chuoi thanh cac tu | \\s+ : \\s: khoang trang , + : 1 hoac nhieu khoang trang 
            //"Hello   Java   World" → ["Hello", "Java", "World"]
            System.out.print("So tu : " + sotu.length);
        }
    }

}
