package org.example.lesson5;

public class Main {
    static Integer a = 25;

    public static void main(String[] args) {
        Person person = new Person(30,"VitaLIC");

        System.out.println(person);

        String s = "Hello";
        String s1 = "Hello";

        System.out.println(s == s1);

        String s2 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println("_--------_");
        System.out.println(s1.equals(s2));




        System.out.println(a);
    }
}
