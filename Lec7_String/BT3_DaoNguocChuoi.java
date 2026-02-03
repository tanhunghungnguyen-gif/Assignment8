package Lec7_String;

import java.util.*;

public class BT3_DaoNguocChuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        String s = sc.nextLine();

        String daonguoc = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            daonguoc += s.charAt(i); // charAt(i) lay ky tu tai vi tri i
        }
        System.out.print("Chuoi dao nguoc : " + daonguoc);
    }

}
