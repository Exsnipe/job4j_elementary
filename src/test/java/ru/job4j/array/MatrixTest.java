package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MatrixTest {

    @Test
    public void when2to2() {
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        int[][] rsl = Matrix.multiply(2);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void when5to5() {
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        int[][] rsl = Matrix.multiply(5);
        Assert.assertArrayEquals(expected, rsl);
    }
}