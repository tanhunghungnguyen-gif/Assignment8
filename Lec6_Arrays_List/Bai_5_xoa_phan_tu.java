package Lec6_Arrays_List;

import java.util.*;

public class Bai_5_xoa_phan_tu {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(100) + 1);
            //cau lenh random 100 la ramdom so tu 0-99 
            //+1 de dung voi de bai yeu cau 1-100s
        }
        System.out.println("Danh sach ban dau " + list);
        //xoa phan tu tai index 3
        list.remove(3);
        System.out.print("Danh sach sau khi xoa " + list);
    }

}
