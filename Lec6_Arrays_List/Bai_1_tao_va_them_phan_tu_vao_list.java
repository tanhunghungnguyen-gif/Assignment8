package Lec6_Arrays_List;

import java.util.*;

public class Bai_1_tao_va_them_phan_tu_vao_list {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) { // i=1 vi de bai yeu cau in tu 1 -10
            list.add(i);
        }
        System.out.println("Danh sach so nguyen : " + list);

    }

}
