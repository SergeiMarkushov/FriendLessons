package org.example.lesson4;

public class Main {

    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Hello");//
//            }
//        for (int i = 2; i <= 10; i+=2)
//        {
//            System.out.println(i);
//        }
        StringBuilder строка = new StringBuilder("C");
        int count = 15;
        while (строка.length() < count) {
            строка.append("V");
        }
        System.out.println(строка);
    }
}
