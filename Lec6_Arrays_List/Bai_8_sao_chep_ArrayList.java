package Lec6_Arrays_List;

import java.util.*;

public class Bai_8_sao_chep_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Tao");
        fruits.add("Chom chom");
        fruits.add("Cam");
        fruits.add("Quyt");
        fruits.add("Xoai");
        fruits.add("Nho");

        ArrayList<String> copy_fruits = new ArrayList<>(fruits);

        System.out.println("Danh sach trai cay goc : " + fruits);
        System.out.println("Danh sach trai cay goc sau khi sao chep : " + copy_fruits);
    }

}
