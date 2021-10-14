package ru.job4j.array;

public class GameWin {
    public static boolean isWin(char[][] matrix) {
        boolean isWin = false;
        for (int diagonalInd = 0; diagonalInd < 5; diagonalInd++) {
            if (matrix[diagonalInd][diagonalInd] == 'X' && MatrixCheck.monoHorizontal(matrix, diagonalInd) || MatrixCheck.monoVertical(matrix, diagonalInd)) {
                return true;
            }
        }
        return isWin;
    }

}
