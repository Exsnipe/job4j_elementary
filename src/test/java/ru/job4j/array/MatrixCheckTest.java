package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MatrixCheckTest {

    @Test
    public void whenHasX() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean rsl = MatrixCheck.monoHorizontal(board, row);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenVerticalHasX() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        int cell = 2;
        boolean result = MatrixCheck.monoVertical(board, cell);
        Assert.assertTrue(result);
    }

    @Test
    public void whenThereAreNoMonoVertical() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', 'X'}
        };
        int cell = 2;
        boolean result = MatrixCheck.monoVertical(board, cell);
        Assert.assertFalse(result);
    }

    @Test
    public void whenWrongCell() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        int cell = 1;
        boolean result = MatrixCheck.monoVertical(board, cell);
        Assert.assertFalse(result);
    }

    @Test
    public void whenOutArrayXXX() {
        char[][] array = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] expected = {'X', 'X', 'X'};
        char[] rsl = MatrixCheck.extractDiagonal(array);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenOutArray111() {
        char[][] array = {
                {'1', '0', '0'},
                {'0', '1', '0'},
                {'0', '0', '1'}
        };
        char[] expected = {'1', '1', '1'};
        char[] rsl = MatrixCheck.extractDiagonal(array);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenOutputArrayXYZ() {
        char[][] array = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'}
        };
        char[] expected = {'X', 'Y', 'Z'};
        char[] rsl = MatrixCheck.extractDiagonal(array);
        Assert.assertArrayEquals(expected, rsl);
    }
}