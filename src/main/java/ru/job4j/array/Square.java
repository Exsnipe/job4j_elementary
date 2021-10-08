package ru.job4j.array;

import  java.math.*;

public class Square {
    public static int[] calculate(int bound) {
        int[] sqArray = new int[bound];
        for (int index = 0; index < bound; index++) {
            sqArray[index] = (int) Math.pow(index, 2);
        }
        return sqArray;
    }

    public static void main(String[] args) {
        int[] sqArray = calculate(4);
        for (int number : sqArray) {
            System.out.println(number);
        }
    }
}
