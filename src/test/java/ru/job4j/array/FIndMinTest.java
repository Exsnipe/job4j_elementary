package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FIndMinTest {

    @Test
    public void whenMin0() {
        int[] data = {0, 5, 10};
        int expected = 0;
        int rsl = FindMin.findMin(data);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMin3() {
        int[] data = {10, 5, 3};
        Assert.assertEquals(3, FindMin.findMin(data));
    }

    @Test
    public void whenMin2() {
        int[] data = {10, 2, 5};
        Assert.assertEquals(2, FindMin.findMin(data));
    }
}