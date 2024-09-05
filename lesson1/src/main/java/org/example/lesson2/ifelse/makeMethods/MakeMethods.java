package org.example.lesson2.ifelse.makeMethods;

import javax.swing.*;
import java.util.Scanner;

public class MakeMethods {
    public int a; // виден везде в программе
    private int b; // виден только внутри класса
    protected int c; //виден внутри пакета и у наследников класса
    int d; // default, package private - он виден только внутри пакета


//    public  int chislo(int chislo) {
//        return chislo;
//    }



    public static void main(String[] args) {
//        String s = guessNumber();
//        System.out.println(s);
        drawCat();
    }

    public static String guessNumber() {
        Scanner scanner = new Scanner(System.in);

        String myName = scanner.nextLine();

        return myName + " - Durak";
    }

    public static void drawCat() {
        System.out.println(" _..---...,\"\"-._ ,/}/)\n" +
                " .'' , ``..'(/-<\n" +
                " / _ { ) \\\n" +
                " ; _ `. `. < a(\n" +
                " ,' ( \\ ) `. \\ __.._ .: y\n" +
                " ( <\\_-) )'-.____...\\ `._ //-'\n" +
                " `. `-' /-._))) `-._)))\n" +
                " `...' ");
    }

}
