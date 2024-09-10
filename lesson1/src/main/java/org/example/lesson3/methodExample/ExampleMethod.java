package org.example.lesson3.methodExample;

import org.example.lesson3.objectExample.Triangle;

public class ExampleMethod {
    public static void main(String[] args) {
//        eqaulsNumbers(4, 5);
//        eqaulsNumbers(5,5);
//        eqaulsNumbers(5,6);
//        eqaulsNumbers(2,5);

//        printTriangle(49, 50, 100);
//
//        printTriangle(49, 50);
//
//        createTriangle(3, 5, 7).printTriangle();

        boolean numberEquals = isNumberEquals(4, 5);
        System.out.println(numberEquals);

        boolean numberEquals1 = isNumberEquals(4, 4);
        System.out.println(numberEquals1);

    }

    public static void eqaulsNumbers(int a, int b) {
        if (a == b) {
            System.out.println("равны");
        } else {
            System.out.println("неравны");
        }
    }

    // перегрузка методов
    public static void printTriangle(int a, int b, int c) {
        Triangle triangle = new Triangle(a, b, c);
        triangle.printTriangle();
    }

    public static void printTriangle(int a, int b) {
        int c = 10;
        Triangle triangle = new Triangle(a, b, c);
        triangle.printTriangle();
    }

    public static Triangle createTriangle(int a, int b, int c) {
        return new Triangle(a, b, c);
    }

    public static boolean isNumberEquals(int a, int b) {
        return a == b;
    }
}
