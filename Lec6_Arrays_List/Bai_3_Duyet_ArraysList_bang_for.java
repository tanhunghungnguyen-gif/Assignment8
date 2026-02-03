package Lec6_Arrays_List;

import java.util.*;

public class Bai_3_Duyet_ArraysList_bang_for {

    public static void main(String[] args) {
        ArrayList<Double> gia = new ArrayList<>();
        gia.add(10.5);
        gia.add(12.0);
        gia.add(15.75);
        gia.add(20.0);
        gia.add(31.3);
        System.out.println("Gia san pham : ");
        for (int i = 0; i < gia.size(); i++) {
            System.out.println(gia.get(i));
        }
    }

}
