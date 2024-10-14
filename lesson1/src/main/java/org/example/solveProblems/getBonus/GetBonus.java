package org.example.solveProblems.getBonus;

public class GetBonus {

    public static String getBonus(final int salary, final boolean bonus) {
        if (bonus) {
            return "$" + salary * 10;
        } else {
            return "$" + salary;
        }
    }

    public static String getBonus1(final int salary, final boolean bonus) {
        return bonus ? "$"+salary*10 : "$"+salary;
    }

    public static String getBonus2(final int salary, final boolean bonus) {
        String result = "$";
        if (bonus) {
            result += salary * 10;
        } else {
            result += salary;
        }
        return result;
    }
}
