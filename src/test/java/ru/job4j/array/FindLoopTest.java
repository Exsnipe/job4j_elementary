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

    @Test
    public void whenArrHas5Then4() {
        int[] data = {3, 5, 8, 4, 6, 1, 9, 7, 0, 2};
        int el = 6;
        int start = 2;
        int finish = 6;
        int expected = 4;
        int rsl = FindLoop.indexOf(data, el, start, finish);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenArrHasNot3ThenMinus1() {
        int[] data = {5, 4, 2, 7, 1, 5, 3, 9, 2};
        int el = 3;
        int start = 1;
        int finish = 5;
        int expected = -1;
        int rsl = FindLoop.indexOf(data, el, start, finish);
        Assert.assertEquals(expected, rsl);
    }
}