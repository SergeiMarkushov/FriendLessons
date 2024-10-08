package org.example.lesson6.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String palindrome = "А роза упала на лапу Азора";
//        palindrome(palindrome);
        String toReverse = "Hello, World!";
        //toReverse1(toReverse);
//        duplicate("banana");
//        replaceSpaces("Hi i'm bot");

        trimSpaces("             word     ");
    }

//    Задача 1: Проверка палиндрома
//    Условие:
//    Напишите метод, который принимает строку и проверяет, является ли она палиндромом (читается одинаково с обеих сторон).
//
//    Пример:
//    Input: "А роза упала на лапу Азора"
//    Output: true

    public static void palindrome(String palindrome) { //А роза упала на лапу Азора
        String s = palindrome.replace(" ", ""); //АрозаупаланалапуАзора
        StringBuilder reversedString = new StringBuilder(s).reverse(); //арозАупаланалапуазорА
        if (s.equalsIgnoreCase(reversedString.toString())) { // арозАупаланалапуазорА == АрозаупаланалапуАзора
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void palindrome1(String palindrome) { //А роза упала на лапу Азора
        /*
        1.удаляем пробелы
        2.приводим к одному регистру
        3.сравнение буков
         */
        String s = palindrome.replaceAll(" ", "");
        String upperCaseString = s.toUpperCase();

        boolean isCharEqual = true;

        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if (upperCaseString.charAt(i) != upperCaseString.charAt(j)) {
                isCharEqual = false;
                break;
            }
        }
        System.out.println(isCharEqual);
    }

//    Задача 2: Переворот строки
//    Условие:
//    Напишите метод, который принимает строку и возвращает её в перевёрнутом виде.

    public static void toReverse(String toReverse) {
        StringBuilder result = new StringBuilder(toReverse);
        result.reverse();
        System.out.println(result);
    }

    public static void toReverse1(String toReverse) {
        System.out.println(new StringBuilder(toReverse).reverse());
    }

//    Задача 3: Удаление дубликатов
//    Условие:
//    Создайте метод, который принимает строку и возвращает новую строку,
//    в которой все дубликаты символов удалены, а порядок символов сохранён.

    public static void duplicate(String duplicate) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < duplicate.length(); i++) {

        }
    }


//    Задача 4: Замена пробелов
//    Условие:
//    Напишите метод, который заменяет все пробелы
//    в строке на символы подчеркивания ('_').

    public static void replaceSpaces(String word) {
        String result = word.replace(" ", "_");
        System.out.println(result);
    }

//    Задача 5: Удаление пробелов в начале и конце строки
//    Условие:
//    Напишите метод, который принимает
//    строку и удаляет все пробелы в начале и конце строки.


    public static void trimSpaces(String word) {
        System.out.println(word.trim());
    }
}
