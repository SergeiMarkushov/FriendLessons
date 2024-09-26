package org.example.lesson5.vital;

public class Main {
    public static void main(String[] args) {
        String s = "car";
        System.out.println(s + " is black");
        s += " is black";
        int b = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                b = i;
                break;
            }
        }
        for (int i = 0; i <= b; i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println("blue!");
    }
}
