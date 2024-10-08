package org.example.lesson6.homework;

import java.security.SecureRandom;

public class StringEXample {
    public static void main(String[] args) {
        String s = "Programming";

        for (int i = 0; i < s.length(); i++) {
            char r = s.charAt(i);
            System.out.print(r);
        }
    }
}
