package org.example.lesson5.vital;

public class Main2 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("car");
        s.append(" is black");
        System.out.println(s);
        s.replace(7, 12, "blue!");
        System.out.println(s);
    }
}
