package org.example.lesson8;

public class CarInfo {

    public void printInfoTwoCars(Car car, Car car1) {
        printCarInfo(car);
        System.out.println("===============");
        printCarInfo(car1);
    }

    public void printCarInfo(Car car) {
        System.out.println("Год выпуска: " + car.getYearOfMake());
        System.out.println("Цвет: " + car.getColor());
        System.out.println("Модель: " + car.getModel());
        System.out.println("Макс скорость: " + car.getMaxSpeed());
        System.out.println("Объем двигла: " + car.getEngineVolume());
    }
}
