package ru.job4j.array;

public class MiniDiapason {
    public static int findMin(int[] data, int start, int finish) {
        int min = data[start];
        for (int index = start; index <= finish; index++) {
            if (min > data[index]) {
                min = data[index];
            }
        }
        return min;
    }
}
