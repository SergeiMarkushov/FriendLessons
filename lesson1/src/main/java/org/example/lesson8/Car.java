package org.example.lesson8;

public class Car {
    private int yearOfMake;
    private String color;
    private String model;
    private int maxSpeed;
    private double engineVolume;

    public static String founderOfCarSaloon = "Константин";

    public Car(int yearOfMake, String color, String model, int maxSpeed, double engineVolume) {
        this.yearOfMake = yearOfMake;
        this.color = color;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
    }

    public Car() {
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}