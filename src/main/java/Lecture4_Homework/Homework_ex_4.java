package Lecture4_Homework;

public class Homework_ex_4 {
    public static void main(String[] args) {
        int [] arr = {10,5,6,4,51,21,55};
        int maxNum =  arr[0];

        for(int i = 0; i<arr.length; i++){
            if (arr[i]> maxNum){
                maxNum = arr[i];
            }
        }

        System.out.println("The largest number is " + maxNum);
    }
}
