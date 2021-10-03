package ru.job4j.condition;

public class SwitchWeek {
    public static String nameODay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Mondey";
                break;
            case 2:
                name = "Tesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Mistake";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameODay(8));
    }
}
