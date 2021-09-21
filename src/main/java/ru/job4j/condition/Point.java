package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return dist;
    }

    public static void main(String[] args) {
        double dist = Point.distance(1, 0, 0, 0);
        System.out.println("result (1,0) to (0,0) is " + dist);
        dist  = Point.distance(2, 4, 7, 2);
        System.out.println("result (2,4) to (7,2) is " + dist);
        dist  = Point.distance(3, 1, 5, 4);
        System.out.println("result (3,1) to (5,4) is " + dist);
    }
}
