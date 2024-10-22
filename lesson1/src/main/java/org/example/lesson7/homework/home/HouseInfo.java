package org.example.lesson7.homework.home;

public class HouseInfo {

    public static double getHouseArea(House house) { //площадь дома
        double a = house.high;
        double b = house.width;
        double c = house.length;
        return 2 * (a * b * c);
    }

    public static double getHousePerimeter(House house) { //периметр дома
        double a = house.high;
        double b = house.width;
        double c = house.length;
        return 4 * (a + b + c);
    }

    public static String getHouseColor(House house) { //цвет дома
        return house.color;
    }
}
