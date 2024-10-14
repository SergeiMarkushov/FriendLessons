package org.example.solveProblems.sumAndCount;

import java.util.Arrays;

/*
Данн массив из чисел
нужно посчитать количество положительных чисел
и сумму отрицательных чисел
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,34,56,123,-4,-5,45,-2,-5,89};

        int[] ints = countPositivesSumNegatives(arr);

        System.out.println(Arrays.toString(ints));

    }
    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int summ = 0;
        for (int i = 0; i < input.length; i++) {
            int number = input[i];
            if (number >= 0) {
                count++;
            } else {
                summ+=number; // -5
            }
        }
        return new int[]{count, summ};
    }
}
