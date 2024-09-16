package org.example.homework3.generator;

public class Main {
    public static void main(String[] args) {
        RandomGenerator generator = new RandomGenerator();
        int number = generator.generateIntNumber(6);

        String color = generator.generateColor(number);

        System.out.println(color);

    }
}