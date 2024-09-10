package org.example.lesson3.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println("-----------------------------------");
        System.out.println(a);



        String s = scanner.next();

        System.out.println("-----------------------------------");
        System.out.println(s);
        System.out.println("-----------------------------------");


        scanner.close(); // ОБЯЗАТЕЛЬНО ЗАКРЫВАТЬ!!!!!!!!!!


        // ИЛИ

        tryWithResources();

//        catchException();


    }

    private static void tryWithResources() {
        try (Scanner scanner = new Scanner(System.in)) {  // ресурс закрывается сам

            System.out.println("method try with resources");

            String s = scanner.nextLine();

            System.out.println("-----------------------------------");
            System.out.println(s);
            System.out.println("-----------------------------------");
        }
    }

    private static void catchException() {
        try (Scanner scanner = new Scanner(System.in)) { // ресурс закрывается сам
            int a = scanner.nextInt();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Ты дурак? я жду цифру");
        }
    }
}
