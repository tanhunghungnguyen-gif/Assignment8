package Lec6_Arrays_List;

import java.util.*;

public class Bai_6_dem_so_chan_va_le {

    public static void main(String[] args) {
        ArrayList<Integer> so = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 15; i++) {
            so.add(rd.nextInt(50) + 1); //cong 1 vi de bai yeu cau 1-50
        }
        int chan = 0, le = 0;
        for (int x : so) { //x:so xet tat ca gia tri trong mang (so)
            if (x % 2 == 0) { // chia het cho 2 la chan
                chan++;
            } else {
                le++;
            }
        }
        System.out.println("Danh sach : " + so);
        System.out.println("Tong so chan : " + chan);
        System.out.println("Tong so le : " + le);
    }

}
