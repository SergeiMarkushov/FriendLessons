package org.example.lesson7.homework.home;

public class Building {
    public static void main(String[] args) {
        House house = new House();
        house.high = 15.5;
        house.width = 17.6;
        house.floors = 2;
        house.color = "Red";

        double housePerimetr = HouseInfo.getHousePerimetr(house);
        double houseArea = HouseInfo.getHouseArea(house);
        String houseColor = HouseInfo.getHouseColor(house);

        System.out.println("Perimetr: " + housePerimetr);
        System.out.println("Area: " + houseArea);
        System.out.println("Color: " + houseColor);
        /*
        вывод в консоль:
        Perimetr: 66.2
        Area: 272.8
        Color: Red
         */
    }
}
