package org.example.lesson7.homework.home;

public class HouseInfo {

    public static double getHouseArea(House house) { //площадь дома
        double a = house.high;
        double b = house.width;
        return a * b;
    }

    public static double getHousePerimetr(House house) { //периметр дома
        double a = house.high;
        double b = house.width;
        return 2 * (a + b);
    }

    public static String getHouseColor(House house) { //цвет дома
        return house.color;
    }
}
