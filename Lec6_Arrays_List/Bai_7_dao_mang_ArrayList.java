package Lec6_Arrays_List;

import java.util.*;

public class Bai_7_dao_mang_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        Collections.reverse(list);
        System.out.println("Danh sach sau khi dao nguoc : " + list);
    }

}
