package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 86;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 73.5f;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.17f;
        return rsl;

    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.85f;
        return rsl;
    }

    public static void main(String[]  args) {
        float euro = Converter.rubleToEuro(430);
        boolean passed = euro == 5;
        System.out.println("430 rubles is 5 euro. Test result: " + passed);
        euro = Converter.dollarToEuro(100);
        passed = euro == 85;
        System.out.println("100 dollars is 85 euro. Test result: " + passed);
        float dollars = Converter.rubleToDollar(4116);
        passed = dollars == 56;
        System.out.println("4116 rubles is 56 dollars. Test result: " + passed);
        dollars = Converter.euroToDollar(500);
        passed = dollars == 585;
        System.out.println("500 euro is 585 dollars. Test result: " + passed);
    }
}
