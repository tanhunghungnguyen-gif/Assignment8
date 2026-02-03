package Lec5_Vong_lap;

import java.util.Scanner;

public class Giai_PT_Bac_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Nhap a ");
        double a = sc.nextDouble();

        System.out.print(" Nhap b ");
        double b = sc.nextDouble();

        System.out.print(" Nhap c ");
        double c = sc.nextDouble();

        // Trường hợp a = 0 => pt bậc 1
        if (a == 0) {
            // trường hợp 1 : a,b,c=0
            if (b == 0 && c == 0) {
                System.out.print("Phuong trinh co vo so nghiem");
            } // trường hợp 2 : a=0 , b=0 c khác 0;
            else if (b == 0 && c != 0) {
                System.out.print("Phuong trinh vo nghiem");
            } // trường hợp 3 : a=0 , b khác 0 (c có thể bằng hoặc khác 0 )
            else if (b != 0) {
                double x = -c / b;
                System.out.print("Phuong trinh co mot nghiem : x=" + x);
            }
        } // Trường hợp phương trình căn bậc 2
        else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.print("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / 2 * a;
                System.out.print("Phuong trinh co nghiem kep : x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
