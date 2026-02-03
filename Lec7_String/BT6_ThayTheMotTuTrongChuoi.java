package Lec7_String;

import java.util.*;

public class BT6_ThayTheMotTuTrongChuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nhap chuoi : ");
        String s = sc.nextLine();
        
        System.out.print("Nhap tu can thay the : ");
        String cu = sc.nextLine();
        
        System.out.print("Nhap tu moi de thay the  : ");
        String moi = sc.nextLine();
        
        String ketqua = s.replace(cu,moi);
        
        System.out.print("Chuoi sau khi thay the tu moi : " + ketqua );
    }
    
}
