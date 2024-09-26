package org.example.lesson5.nikita;

public class Main {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("car");
        s.append(" is black");
        System.out.println(s);
        s.insert(6, "!");
        System.out.println(s);

        s.replace(7, 13, " blue");
        System.out.println(s);
        s.deleteCharAt(6);
        System.out.print(s);
    }
}
