package org.example.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        System.out.println("Welcome! \nGuess the number from 1 to 100");
        int attempts = 10;
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        while (attempts != 0) {
            System.out.println("Enter number");
            int a = input();
            if (a == target) {
                System.out.println("You win");
                break;
            } else if (a > target) {
                System.out.println("My number is smaller");
            } else {
                System.out.println("My number is bigger");
            }
            attempts--;
        }
        System.out.println((attempts - 1) + " attemps");
        if ((attempts - 1) == 0) {
            System.out.println("You loose");
        }
    }

    public static int input() {
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }
}
