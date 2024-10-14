package org.example.solveProblems.abbreviateTwoWords;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] twoNames = name.split(" ");
        String firstLetterFirstName = String.valueOf(twoNames[0].charAt(0)).toUpperCase();
        String secondLetterFirstName = String.valueOf(twoNames[1].charAt(0)).toUpperCase();
        return firstLetterFirstName + "." + secondLetterFirstName; // S.M
    }
    // Serg Markush
    // [Serg, Markush]
    // s ^
    // m ^


}
