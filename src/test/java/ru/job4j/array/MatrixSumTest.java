package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixSumTest {

    @Test
    public void whenSum10() {
        int[][] array = {
                {10}
        };
        int expected = 10;
        int rsl = MatrixSum.sum(array);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenSum6() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int expected = 6;
        int rsl = MatrixSum.sum(array);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenSum7() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int expected = 7;
        int rsl = MatrixSum.sum(array);
        Assert.assertEquals(expected, rsl);
    }
}