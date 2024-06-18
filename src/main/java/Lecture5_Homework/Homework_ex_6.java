package Lecture5_Homework;

public class Homework_ex_6 {
    public static void main(String[] args) {
        int[][] array_2d = {
                {1, 0, 0, 0},
                {0, 2, 0, 0},
                {0, 0, 3, 0},
                {0, 0, 0, 4}
        };
        System.out.println("The sum of diagonal is: " + (array_2d[0][0]+array_2d[1][1]+array_2d[2][2]+array_2d[3][3]));
    }



}
