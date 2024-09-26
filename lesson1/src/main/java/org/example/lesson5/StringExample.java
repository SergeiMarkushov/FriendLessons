package org.example.lesson5;

public class StringExample {
    public static void main(String[] args) {
        String s = "car is black";

        for (int i = s.length() - 1; i >= 0 ; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.reverse());


    }
}
