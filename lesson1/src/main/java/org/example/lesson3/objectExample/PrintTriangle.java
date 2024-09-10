package org.example.lesson3.objectExample;

public class PrintTriangle {
    public static void main(String[] args) {
        Triangle bigTriangle = new Triangle(10,20, 5);

        String s = new String("Hello");

        System.out.println(s.length());

        bigTriangle.printTriangle();
        printTheeNumber(false);
    }

    public static void printTheeNumber(boolean a) {
        if (a) {
            System.out.println("32");
        } else {
            System.out.println("5");
        }
    }
}
