package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 4, 3, 2};
        int el = 5;
        int index = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, index);
    }

    @Test
    public void whenArrayHasNot5ThenMinuus1() {
        int[] data = new int[] {5, 4, 3, 2};
        int el = 6;
        int index = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, index);
    }
}