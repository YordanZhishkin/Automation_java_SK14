package Lecture4_Homework;

import java.util.Scanner;

public class Homework_ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of vacation you want?  ");
        String type = sc.next();
        System.out.println("How money per day you have? ");
        int budget = sc.nextInt();

        if ((type.equals("mountain") || type.equals("Mountain")) && budget <= 30) {
            System.out.println("Bulgarian mountains are your destination!");
        } else if (((type.equals("mountain") || type.equals("Mountain")) && budget > 30)) {
            System.out.println("You can explore outside Bulgarian mountains!");
        } else if (((type.equals("beach") || type.equals("Beach")) && budget <= 50)) {
            System.out.println("Bulgarian beaches is yours!");
        } else if (((type.equals("beach") || type.equals("Beach")) && budget > 50)) {
            System.out.println("You can have fun outside Bulgarian beaches!");
        } else {
            System.out.println("Can not find type of trip!");
        }

    }
}
