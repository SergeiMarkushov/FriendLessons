package org.example.lesson3.randomExample;

import java.util.Random;

public class ChoosePerson {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(2);
        Person person = returnPerson(a);
        System.out.println(person.getName());
    }

    public static Person returnPerson(int a) {
        Person[] people = new Person[3];
        people[0] = new Person("Alex");
        people[1] = new Person("Vit");
        people[2] = new Person("Nekit");

        return people[a];
    }
}
