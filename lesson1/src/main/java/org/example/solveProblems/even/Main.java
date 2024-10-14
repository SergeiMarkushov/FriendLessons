package org.example.solveProblems.even;

public class Main {
    public static void main(String[] args) {
        boolean even = even(56);
        System.out.println(even);
    }

    public static boolean even(int n) {
        return n % 2 == 0;
    }
}
