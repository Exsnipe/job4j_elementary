package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = index; i < array.length; i++) {
                    if (array[i] != null) {
                        SwitchArray.swap(array, point, i);
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        for (int index = 0; index < input.length; index++) {
            System.out.print(input[index] + " ");
        }
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
