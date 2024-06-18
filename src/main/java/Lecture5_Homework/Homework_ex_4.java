package Lecture5_Homework;

public class Homework_ex_4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 100};
        int largest = arr[0];
        for (int i =0; i<arr.length; i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
