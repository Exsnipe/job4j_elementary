package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        names[0] = "Ivan Ivanov";
        System.out.println(names[0]);
        names[1] = "Petr Petrov";
        System.out.println(names[1]);
        names[2] = "Fedor Fedorov";
        System.out.println(names[2]);
        names[3] = "Anton Antonov";
        System.out.println(names[3]);
    }
}
