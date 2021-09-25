package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if (name.equals("super Mario")) {
            System.out.println("Start super Mario");
        }
        if (name.equals("tetris")) {
            System.out.println("Start tetris");
        }
        if (name.equals("tanks")) {
            System.out.println("Start tanks");
        }
    }

    public static void main(String[] args) {
        menu("tanks");
    }
}
