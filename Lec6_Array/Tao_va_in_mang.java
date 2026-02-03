package Lec6_Array;

import java.util.Arrays;

public class Tao_va_in_mang {

    public static void main(String[] args) {
        int[] number = new int[10];
        // gan gia tri cho mang
        for (int i = 0; i < 8; i++) {
            number[i] = 2 * i;
        }
        // Hien thi mang
        // Cach 1 :
        System.out.println("number[]" + Arrays.toString(number));

        // Cach 2 :
        for (int i = 0; i < 10; i++) {
            System.out.println("number[" + i + "]=" + number[i]);
        }
    }

}
