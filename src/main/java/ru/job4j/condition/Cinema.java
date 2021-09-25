package ru.job4j.condition;

public class Cinema {
    public static void  access(int age) {
        System.out.println("Age of customer is " + age);
        if (age >= 18) {
            System.out.println("welcome to the cinema");
        } else {
            System.out.println("This is not for you");
        }
    }

    public static void main(String[] args) {
        access(21);
        access(16);
    }
}
