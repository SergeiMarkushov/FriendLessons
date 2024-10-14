package org.example.solveProblems.grow;

public class Grow {
    public static int grow(int[] x){
        int result = 1;
        for (int i = 0; i < x.length; i++) {
            result *= x[i];
        }
        return result;
    }


}
