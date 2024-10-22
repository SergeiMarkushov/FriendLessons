package org.example.lesson71.classes.boots;

public class Ремонт {

    public static String чиниБотинки(Ботинки моиБотинки) {
        if (моиБотинки.состояние.equals("Ушатанные")) {
            return "Иди купи новые";
        }
        моиБотинки.состояние = "Отремонтировано";
        return "Отремонтировано";
    }

}
