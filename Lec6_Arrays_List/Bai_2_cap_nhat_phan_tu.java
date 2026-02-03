package Lec6_Arrays_List;

import java.util.*;

public class Bai_2_cap_nhat_phan_tu {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");
        colors.add("orange");
        //thay the phan tu thu 2 index =1
        colors.set(1, "yellow");
        System.out.println("Danh sach mau sau khi cap nhat : " + colors);
    }

}
