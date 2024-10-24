package org.example.lesson8.Zoo;

public class Animal {
    private int age;
    private String name;

    private static int countOfAnimals;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
        countOfAnimals++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }
}
