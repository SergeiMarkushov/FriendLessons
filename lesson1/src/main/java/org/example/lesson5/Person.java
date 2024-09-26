package org.example.lesson5;

public class Person {
    private int age;

    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
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

    @Override
    public String toString() {
        return "Person:" + "{" +
                "name: " + name + "}, {" +
                "age: " + age + "}";
    }
}
