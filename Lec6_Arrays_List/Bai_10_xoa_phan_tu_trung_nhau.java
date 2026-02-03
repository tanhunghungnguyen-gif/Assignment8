package Lec6_Arrays_List;

import java.util.*;

public class Bai_10_xoa_phan_tu_trung_nhau {

    public static void main(String[] args) {
        ArrayList<String> ten = new ArrayList<>();
        ten.add("Hung");
        ten.add("Hoa");
        ten.add("Hao");
        ten.add("Hau");
        ten.add("Hien");
        ten.add("Hung");

        LinkedHashSet<String> ten_xoa = new LinkedHashSet<>(ten);
        ten.clear();
        ten.addAll(ten_xoa);

        System.out.println("Danh sach ten sau khi xoa trung lap" + ten_xoa);
    }

}
