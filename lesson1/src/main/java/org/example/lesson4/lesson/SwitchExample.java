package org.example.lesson4.lesson;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        String name = returnSomeString();

        switchExample("Максим");

        ifExample(name);

        System.out.println(ifExample1(returnSomeString()));


    }

    public static String returnSomeString() {
        Random random = new Random();
        int randomNumber = random.nextInt(4);

        String[] strings = {"Вася", "Петя", "Валя", "Коля"};
        return strings[randomNumber];
    }

    public static void switchExample(String name) {
        switch (name) {
            case "Вася":
                System.out.println("Я нашел " + name);
                break;
            case "Петя":
                System.out.println("Я нашел " + name);
                break;
            case "Валя":
                System.out.println("Я нашел " + name);
                break;
            case "Коля":
                System.out.println("Я нашел " + name);
                break;
            default:
                System.out.println("Нет такого имени");
        }
    }

    public static void ifExample(String name) {
        if (name.equals("Вася")) {
            System.out.println("Я нашел " + name);
        } else if (name.equals("Петя")) {
            System.out.println("Я нашел " + name);
        } else if (name.equals("Валя")) {
            System.out.println("Я нашел " + name);
        } else if (name.equals("Коля")) {
            System.out.println("Я нашел " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static String ifExample1(String name) {
        if (name.equals("Вася")) {
            return "Я нашел " + name;
        }

        if (name.equals("Петя")) {
            return "Я нашел " + name;
        }

        if (name.equals("Валя")) {
            return "Я нашел " + name;
        }

        if (name.equals("Коля")) {
            return "Я нашел " + name;
        }
        return "Нет такого имени";
    }

}
