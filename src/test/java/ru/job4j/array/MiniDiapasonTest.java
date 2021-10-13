package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiniDiapasonTest {

    @Test
    public void whenMin0() {
        int[] data = {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int expected = 0;
        int rsl = MiniDiapason.findMin(data, start, finish);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMin1() {
        int[] data = {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int expected = 1;
        int rsl = MiniDiapason.findMin(data, start,  finish);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMin2() {
        int[] data = {10, 2, 5, 1};
        int start = 0;
        int finish =  2;
        int expected = 2;
        int rsl = MiniDiapason.findMin(data, start, finish);
        Assert.assertEquals(expected, rsl);
    }
}


