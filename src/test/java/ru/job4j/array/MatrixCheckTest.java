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
}