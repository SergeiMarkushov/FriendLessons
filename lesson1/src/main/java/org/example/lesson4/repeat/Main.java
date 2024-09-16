package org.example.lesson4.repeat;



public class Main {
    public static void main(String[] args) {

//        создайПтичку(); // = Птичка птичка = new Птичка();
        Птичка птичка = new Птичка();
        птичка.имя = "Курица";
        птичка.весПтички = 2;

//        System.out.println(создайПтичку());
//        System.out.println(птичка);

        System.out.println(создайПтичку("Петух"));
//
//        System.out.println(создайПтичку() == птичка);
//        System.out.println(создайПтичку().equals(птичка));

    }

    public static void printSmth() {
        System.out.println("smth");
    }

    public static String printSmth2() {
        return "Smth";
    }

    public static int printInt() {
        return 1;
    }

    public static double returnDouble() {
        return 2.0d;
    }

    public static boolean returnBoolean() {
        return true;
    }

    public static Птичка создайПтичку() {
        Птичка птичка = new Птичка();
        птичка.имя = "Курица";
        птичка.весПтички = 2;
        return птичка;
    }

    public static Птичка создайПтичку(String имя) {
        Птичка птичка = new Птичка();
        птичка.имя = имя;
        птичка.весПтички = 2;
        return птичка;
    }



}
