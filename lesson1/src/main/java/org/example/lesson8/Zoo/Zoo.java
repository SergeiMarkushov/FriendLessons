package org.example.lesson8.Zoo;

public class Zoo {
    public static void main(String[] args) {
        Lion lion1 = new Lion(1, "Tiger1");
        Lion lion2 = new Lion(4, "Tiger2");
        Lion lion3 = new Lion(2, "Tiger3");

        Tiger tiger1 = new Tiger(4, "Tiger1");
        Tiger tiger2 = new Tiger(1, "Tiger2");
        Tiger tiger3 = new Tiger(7, "Tiger3");


        printAnimalInfo(lion1);
        System.out.println("==========");
        printAnimalInfo(lion2);
        System.out.println("==========");
        printAnimalInfo(lion3);
        System.out.println("==========");
        printAnimalInfo(tiger1);
        System.out.println("==========");
        printAnimalInfo(tiger2);
        System.out.println("==========");
        printAnimalInfo(tiger3);
        System.out.println("==========");

        System.out.println("Всего животных было создано: "  + Animal.getCountOfAnimals());

    }

    public static void printAnimalInfo(Animal animal) {
        System.out.println("I'm: " + animal.getClass().getName());
        System.out.println("I'm: " + animal.getAge());
        System.out.println("My name is " + animal.getName());
    }
}
