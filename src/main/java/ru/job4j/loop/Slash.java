package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        boolean left, right;
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell <= size; cell++) {
                if (cell ==  row || size - 1 - cell == row) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        draw(3);
        System.out.println();
        draw(5);
    }
}
