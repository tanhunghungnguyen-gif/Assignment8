package Lec7_String;

import java.util.*;

public class BT5_DemSoLanXuatHienCuaMotKyTu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap chuoi : ");
        String s = sc.nextLine();
        
        System.out.print("Nhap ky tu can dem : ");
        char c = sc.next().charAt(0);
        // sc.next() doc 1 tu (chuoi ngan)
        //charAt(0) lay ky tu dau tien
        //gan bien c kieu char vi kieu char xet tung ky tu 1
        
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                dem++;
            }
        }
        System.out.print("So lan xuat hien cua " + c + " la : " + dem);
        System.out.println(s.length());
    }
    
}
