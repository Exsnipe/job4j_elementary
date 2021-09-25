package ru.job4j.condition;

public class AllertDivByZero {
    public static void main(String[] args) {
        possibleDive(4);
        possibleDive(0);
        possibleDive(-6);
    }

    public static void possibleDive(int result) {
        if (result == 0) {
            System.out.println("Could not div by 0.");
        }

        if (result < 0) {
            System.out.println("This is negative number");
        }
    }
}
