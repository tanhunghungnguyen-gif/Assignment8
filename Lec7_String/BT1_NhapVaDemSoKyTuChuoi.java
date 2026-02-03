package Lec7_String;

import java.util.*;

public class BT1_NhapVaDemSoKyTuChuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi : ");

        String s = sc.nextLine();

        int sokytu = s.length();
        System.out.print("So ky tu cua chuoi la : " + sokytu);

    }

}
