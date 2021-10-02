package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        boolean rightNumbers = isRightNum(x1) && isRightNum(y1) && isRightNum(x2) && isRightNum(y2);
        if ((Math.abs(y2  - y1) == Math.abs(x2 - x1)) && rightNumbers) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }

    public static boolean isRightNum(int num) {
        boolean rsl = num >= 0 && num <= 7;
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(1, 2, 5, 6));
    }
}
