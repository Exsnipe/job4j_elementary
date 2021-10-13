package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MiniDiapason.findMin(data, index, data.length - 1);
            int indexMin = FindLoop.indexOf(data, min, 0, data.length);
            int buf = data[indexMin];
            data[indexMin] = data[index];
            data[index] = buf;
        }
        return data;
    }
}
