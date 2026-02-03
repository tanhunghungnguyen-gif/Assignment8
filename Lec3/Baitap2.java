package Lec3;

import java.util.Scanner;

public class Baitap2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter fullname :: ");
        String sentence = keyboard.nextLine();
        System.out.println(sentence);

        System.out.print("enter studentID ::");
        int s = keyboard.nextInt();
        System.out.println(s);

        System.out.print("Enter Hometown:: ");
        String hometown = keyboard.nextLine();
        System.out.println(hometown);

        System.out.print("enter GPA ::");
        float gpa = keyboard.nextFloat();
        System.out.println(gpa);

        System.out.print("Enter mayjor :: ");
        String mayjor = keyboard.nextLine();
        System.out.println(mayjor);

        System.out.print("enter Scholarship ::");
        boolean b = keyboard.nextBoolean();
        System.out.println(b);
    }

}
