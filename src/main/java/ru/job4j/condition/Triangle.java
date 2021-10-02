package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double bc, double ac) {
        return (ab + bc >  ac) &&  (ab + ac > bc) && (bc + ac > ab);
    }

    public static void main(String[] args) {
        System.out.println(exist(1, 2, 2.5));
    }
}
