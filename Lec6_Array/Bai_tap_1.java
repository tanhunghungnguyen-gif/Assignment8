package Lec6_Array;

import java.util.Scanner;

public class Bai_tap_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhap kich thuoc cua mang
        System.out.print("Nhap kich thuoc cua mang :");
        int n = sc.nextInt();
        //khai bao mang
        int[] a = new int[n];
        //nhap cac phan tu cua mang
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu a[" + i + "] :");
            a[i] = sc.nextInt();
        }
        //xuat cac phan tu cua mang
        System.out.print("Cac phan tu trong mang la:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();

    }

}
