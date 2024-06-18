package Lecture4_Homework;

import java.util.Scanner;

public class Homework_ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 16) {
            System.out.println("You are eligible to work.");
        }
    }
}
