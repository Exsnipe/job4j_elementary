package ru.job4j.array;

public class FindMin {
    public static int findMin(int[] data) {
        int min = data[0];
        for (int index = 0; index < data.length; index++) {
            if (data[index] < min) {
                min = data[index];
            }
        }
        return min;
    }
}
