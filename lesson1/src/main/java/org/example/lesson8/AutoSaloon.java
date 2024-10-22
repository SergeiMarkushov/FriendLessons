package org.example.lesson8;

public class AutoSaloon {
    public static void main(String[] args) {
        Car car = new Car(1998, "red", "Taureg", 250, 2.2);

        Car car1 = new Car();
        car1.setYearOfMake(2025);
        car1.setColor("blue");
        car1.setModel("Lamba");
        car1.setMaxSpeed(300);
        car1.setEngineVolume(4.2);


//        CarInfo.printCarInfo(car1);

//        CarInfo.printInfoTwoCars(car, car1);

        CarInfo carInfo = new CarInfo();

//        carInfo.printInfoTwoCars(car,car1);


        System.out.println(Car.founderOfCarSaloon);
    }
}
