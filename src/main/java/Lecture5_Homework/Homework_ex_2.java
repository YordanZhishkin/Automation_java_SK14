package Lecture5_Homework;

public class Homework_ex_2 {
    public static void main(String[] args) {
        int[][] array_2d = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(array_2d[i][j]);
            }
        }
    }
}
