package Lecture1_Homework;

import java.util.Scanner;

public class Input_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length: ");
        int length = scanner.nextInt();

        System.out.print("Input height: ");
        int height = scanner.nextInt();

        int result = (length * height) / 2;
        System.out.println("Area is: " + result);

    }
}
