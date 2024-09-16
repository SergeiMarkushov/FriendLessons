package org.example.homework3.generator;

import java.util.Random;

public class RandomGenerator {

    public int generateIntNumber(int generateTo) {
        Random random = new Random();
        int target = random.nextInt(generateTo) + 1;
        return target;
    }

    public String generateColor(int a) {
        if (a == 1) {
            return "red";
        } else if (a == 2) {
            return "blue";
        } else if (a == 3) {
            return "black";
        } else if (a == 4) {
            return "white";
        } else  if (a == 5) {
            return "green";
        } else {
            return "orange";
        }
    }
}
