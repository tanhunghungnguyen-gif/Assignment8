package Lec7_String;

import java.util.*;

public class BT4_LoaiBoKhoangTrangThua {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        String s = sc.nextLine();

        s = s.trim();                 //xoa khoang trang dau va cuoi
        s = s.replaceAll("\\s+", " ");//gop nhieu khoang trang thanh 1
        System.out.print("Chuoi sau khi loai bo khoang trang thua : " + s);
    }

}
