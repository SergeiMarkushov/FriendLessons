package org.example.lesson5.nikita;

public class Main2 {
    public static void main(String[] args) {

//        String s = "car";
//        System.out.println(s + " is black");
//        s = s + " is black";
//        for (int i = 0; i < s.length() ; i++) {
//            if (i==3) {
//                System.out.print("!");
//            }
//            System.out.print(s.charAt(i));
//        }
//        int s1=0;
//        for (int i = s.length()-1; i >= 0 ; i--) {
//            if (s.charAt(i)==' '){
//                s1=i;
//                break;
//            }
//
//        }
//        for (int i = 0; i <= s1 ; i++) {
//            System.out.print(s.charAt(i));
//        }
//        System.out.println("blue!");

        String s = "car is! blue";
        String s1 = s.replace("!", "");


        System.out.println(s1);
    }
}

