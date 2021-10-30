package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int max = left > right ? left : right;
        return max;
    }

    public static int max(int one, int two, int third) {
        int temp = max(one, two);
        return max(third, temp);
    }

    public static int max(int one, int two, int third, int firth) {
        int temp = max(one, two, third);
        return max(temp, firth);
    }

    public static void main(String[] args) {
        int max = Max.max(2, 7);
        System.out.println(max);
        max = Max.max(6, 5);
        System.out.println(max);
    }
}
