package Lecture4_Homework;

import java.util.Scanner;

public class Homework_ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        int price = sc.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        double total = quantity * price;
//      double between_100_and_120 = 0.15;
//      double greater_than_120 = 0.20;

        System.out.println("The revenue from sale: " + total + "$");

        if (quantity >= 100 && quantity <= 120) {
            total = total * 0.15;
            System.out.println("Discount:" + total + "$(15.0%)");
        }
        if (quantity > 120) {
            total = total * 0.2;
            System.out.println("Discount:" + total + "$(20.0%)");
        }
    }
}

