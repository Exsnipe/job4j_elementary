package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = new int[] {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = new int[] {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3To6() {
        int[] input = new int[] {3, 7, 3, 3, 7, 1, 9, 4, 2};
        int source = 3;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = new int[] {3, 7, 3, 9, 7, 1, 3, 4, 2};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenNoSwap() {
        int[] input = new int[] {2, 3, 0, 5};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = new int[] {2, 0, 3, 5};
        Assert.assertArrayEquals(expected, result);
    }
}