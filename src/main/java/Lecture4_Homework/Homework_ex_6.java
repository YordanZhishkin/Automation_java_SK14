package Lecture4_Homework;

import java.util.ArrayList;

public class Homework_ex_6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(15);
        numbers.add(32);
        numbers.add(42);
        numbers.add(55);
        numbers.add(75);
        numbers.add(122);
        numbers.add(132);
        numbers.add(150);
        numbers.add(180);
        numbers.add(200);
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) % 5 == 0) {
                System.out.println(numbers.get(i));
            }
            if (numbers.get(i) > 150) {
                break;
            }
        }
    }
}
