package Lecture5_Homework;

import java.lang.reflect.Array;

public class Homework_ex_7 {
    public static void main(String[] args) {
        String str = "oooo";
        String rstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rstr = ch + rstr;
        }
        if (str.equals(rstr)) {
            System.out.println("The word is palindrome!");
        } else {
            System.out.println("The word isn't palindrome!");
        }

    }
}




