package org.example.solveProblems.getBonus;

public class Main {
    public static void main(String[] args) {
        String falseBonus = GetBonus.getBonus2(15000, false);
        String trueBonus = GetBonus.getBonus2(9000, true);

        System.out.println(falseBonus); // 15_000
        System.out.println(trueBonus); // 90_000
    }
}
