package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int[] expected = new int[] {0, 1, 4};
        int[] rsl = Square.calculate(3);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenBound5Then014916() {
        int[] expected = new int[] {0, 1, 4, 9, 16};
        int[] rsl = Square.calculate(5);
        Assert.assertArrayEquals(expected, rsl);
    }
}