package Lec6_Array;

import java.util.*;

public class Bai_tap_thoi_tiet_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so ngay:  ");
        int days = sc.nextInt();
        // mang de luu tru nhiet do trong ngay
        int[] temp = new int[days];
        int tong = 0;
        //doc va luu tru nhiet do moi ngay
        for (int i = 0; i < days; i++) {
            System.out.print("Ngay" + (i + 1) + "'s high temp: ");
            temp[i] = sc.nextInt();
            tong += temp[i];
        }
        double Trungbinh = (double) tong / days;
        int count = 0;
        // xem lieu co ngay nao lon hon trung binh khong
        for (int i = 0; i < days; i++) {
            if (temp[i] > Trungbinh) {
                count++;
            }
        }
        System.out.printf("Average temp = %.1f", Trungbinh);
        System.out.println();
        System.out.println(count + " days above average");
        System.out.println("Temperatures : " + Arrays.toString(temp));
        Arrays.sort(temp); // sap xep mang theo thu tu tu` nho den lon'
        System.out.println("Two coldest days: " + temp[0] + "," + temp[1]); // 2 so dau thi la so nho nhat
        System.out.println("Two hotest day: " + temp[temp.length - 1] + "," + temp[temp.length - 2]); // 2 so cuoi la so lon nhat

    }

}
