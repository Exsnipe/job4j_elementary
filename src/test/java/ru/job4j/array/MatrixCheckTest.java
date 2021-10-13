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
}