package Lec6_Arrays_List;

import java.util.*;

public class Bai_9_tim_so_lon_nhat_va_nho_nhat {

    public static void main(String[] args) {
        ArrayList<Integer> so = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i <= 5; i++) {
            so.add(rd.nextInt(100));
        }
        int max = Collections.max(so);
        int min = Collections.min(so);

        System.out.println("Danh sach : " + so);
        System.out.println("So lon nhat : " + max);
        System.out.println("So nho nhat : " + min);
    }

}
