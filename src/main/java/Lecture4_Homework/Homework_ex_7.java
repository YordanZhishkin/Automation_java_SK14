package Lecture4_Homework;

import java.util.ArrayList;

public class Homework_ex_7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        System.out.println(list);
        System.out.println("After reversed: ");
        System.out.println(list.reversed());
    }
}

