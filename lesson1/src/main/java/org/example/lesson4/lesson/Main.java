package org.example.lesson4.lesson;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

// цикл for
//        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
//        }
// цикл while (пока)
//        int timeToGoHome = 18;
//        int now = 11;
//
//        while (now <= timeToGoHome) {
//            if (now >= 18) {
//                System.out.println("Отдыхаю");
//                System.out.println("Сейчас " + now);
//                return;
//            }
//            System.out.println("Работаю");
//            System.out.println("Сейчас " + now);
//            now++;
//        }

//        int бутылокПива = 24;
//        int песон = 5;
//
//        while (бутылокПива >= 0 && бутылокПива >= песон) {
//            бутылокПива -= песон;
//            System.out.println("Бухаем");
//            System.out.println("Осталось: " + бутылокПива);
//        }
        // do while
//        int i = 10;
//        do {
//            System.out.println(i);
//            i--;
//        } while (i != 10);
//        System.out.println(i);

//        while (i != 10) {
//            System.out.println(i);
//            i--;
//        }
//        System.out.println(i);

        int i = 6;


//        if (i == 5) {
//            System.out.println("i = 5");
//        } else if (i == 4) {
//            System.out.println("i = 4");
//        } else if (i == 3) {
//            System.out.println("i = 3");
//        } else if (i == 2) {
//            System.out.println("i = 2");
//        } else if (i == 1) {
//            System.out.println("i = 1");
//        } else {
//            System.out.println("i = 0");
//        }

        switch (i) {
            case 5:
                System.out.println("i = 5");
                break;
            case 4:
                System.out.println("i = 4");
                break;
            case 3:
                System.out.println("i = 3");
                break;
            case 2:
                System.out.println("i = 2");
                break;
            case 1:
                System.out.println("i = 1");
                break;
            default:
                System.out.println("это не от 5 до 0");
        }

    }
}
