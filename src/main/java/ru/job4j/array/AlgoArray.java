package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] mas = new int[] {5, 3, 2, 1, 4};
        for (int number : mas) {
            System.out.print(number + " ");
        }
        System.out.println();
        int temp = mas[0];
        mas[0] = mas[3];
        mas[3] = temp;
        temp = mas[3];
        mas[3] = mas[4];
        mas[4] = temp;
        temp = mas[1];
        mas[1] = mas[2];
        mas[2] = temp;
        for (int number : mas) {
            System.out.print(number + " ");
        }

    }
}