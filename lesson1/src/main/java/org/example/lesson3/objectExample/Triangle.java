package org.example.lesson3.objectExample;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printTriangle() {
        System.out.println("Нарисовали треугольник со сторонами: " + a + " " + b + " " + c);
    }

}
