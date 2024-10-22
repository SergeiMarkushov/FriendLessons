package org.example.lesson7.homework.home;

public class Building {
    public static void main(String[] args) {
        House house = new House();
        house.high = 15.5;
        house.width = 17.6;
        house.length = 25.6;
        house.floors = 2;
        house.color = "Red";

        double housePerimeter = HouseInfo.getHousePerimeter(house);
        double houseArea = HouseInfo.getHouseArea(house);
        String houseColor = HouseInfo.getHouseColor(house);

        System.out.println("Perimetr: " + housePerimeter);
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
