package org.example.lesson71.classes;


public class Main {
    public static void main(String[] args) {
        Человек незнакомец = new Человек();
        незнакомец.имя = "Вася";
        незнакомец.возраст = 16;
        незнакомец.пол = Пол.М;

        напишиВКонсольИмя("Любомир");
        напишиВКонсольИмя(незнакомец.имя);
    }

    public static void напишиВКонсольИмя(String пидор) {
        System.out.println(пидор);
    }

}
