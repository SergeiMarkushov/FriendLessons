package org.example.lesson1;
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = b - ++a + a; //10 - 6 + 6;
        int d = b - a++ - a; //10 - 5 - 6;
        System.out.println(c);
        System.out.println(d);
    }
}