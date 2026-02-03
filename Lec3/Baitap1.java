package Lec3;

import java.util.Scanner;

public class Baitap1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter fullname :: ");
        String sentence = keyboard.nextLine();
        System.out.println(sentence);

        System.out.print("enter studentID ::");
        int s = keyboard.nextInt();
        System.out.println(s);

    }

}
