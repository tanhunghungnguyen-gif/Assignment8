package Lec6_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_tap_1_Sap_xep_va_tinh_tong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a.nhap va hien thi mang
        System.out.print("Nhap mang : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu A [" + i + "]: ");
            A[i] = sc.nextInt();
        }
        System.out.println("Mang A[]" + Arrays.toString(A));
        //b.Dao nguoc mang
        System.out.print("Dao nguoc mang : ");
        for (int i = A.length - 1; i >= 0; i--) {
            System.out.print(+A[i] + " ");
        }
        System.out.println("");
        //c.Hien thi cac so chan
        System.out.print("Cac so chan : ");
        for (int x : A) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
        //d.tinh tong cac thanh phan chia het cho 3 va 5
        int tong = 0;
        for (int x : A) { //duyet tung phan tu trong mang
            if (x % 3 == 0 && x % 5 == 0) { // % = chia het cho
                tong += x; //cong don
            }
        }
        System.out.print("Tong cac so chia het cho 3 va 5 : " + tong);
        System.out.println();
        //e.Sap xep mang tang dan
        Arrays.sort(A); //sap xep theo thu tu tang dan
        System.out.print("Mang tang dan A " + Arrays.toString(A));
        System.out.println();
        //f.Sap xep mang giam dan
        int[] B = A.clone(); //sao chep mang
        Arrays.sort(B);
        System.out.print("Mang giam dan A : ");
        for (int i = B.length - 1; i >= 0; i--) {
            System.out.print(B[i] + " ");
        }
    }

}
