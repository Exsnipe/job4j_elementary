package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int cell) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] array) {
        char[] outArray = new char[array.length];
        for (int index = 0; index < array.length; index++) {
            outArray[index] = array[index][index];
        }
        return outArray;
    }

    public static boolean isWin(char[][] matrix) {
        boolean isWin = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == 'X' && (monoHorizontal(matrix, i) || monoVertical(matrix, i))) {
                return true;
            }
        }
        return isWin;
    }
}