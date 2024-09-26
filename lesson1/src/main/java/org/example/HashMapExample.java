package org.example;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("1","Vital");
//        map.put("2","Nikita");
//        map.put("3","Kostya");
//
//        System.out.println(map.getOrDefault("1", "Not fount"));

        HashMap<SomeKey, String> map1 = new HashMap<>();

        SomeKey one = new SomeKey(1);
        SomeKey two = new SomeKey(2);
        SomeKey three = new SomeKey(3);


        map1.put(one,"Vital");
        map1.put(two,"Nikita");
        map1.put(three,"Kostya");

        System.out.println(map1.getOrDefault(three, "Not fount"));

    }
}

class SomeKey {
    private int a;

    public SomeKey(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
