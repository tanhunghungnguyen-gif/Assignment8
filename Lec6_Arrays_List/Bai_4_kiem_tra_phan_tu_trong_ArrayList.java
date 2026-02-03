package Lec6_Arrays_List;

import java.util.*;

public class Bai_4_kiem_tra_phan_tu_trong_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> ThanhPho = new ArrayList<>();
        ThanhPho.add("New York");
        ThanhPho.add("Paris");
        ThanhPho.add("London");
        ThanhPho.add("Ha Noi");
        ThanhPho.add("Tokyo");
        if (ThanhPho.contains("London")) { //contains dung de kiem tra xem phan tu co ton tai hay khong
            System.out.print("Danh sach co chua thanh pho London.");
        } else {
            System.out.print("Danh sach khong co chua thanh pho London");
        }
    }

}
